package com.emc.shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.emc.shoppingcart.model.Product;
import com.emc.shoppingcart.model.User;
import com.emc.shoppingcart.model.UserLogin;
import com.emc.shoppingcart.services.ProductService;
import com.emc.shoppingcart.services.UserService;

@Controller
public class ShoppingController {

	@Autowired
	UserService userService;

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		UserLogin login = new UserLogin();
		model.addAttribute("loginForm", login);
		return "userLoginForm";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		User user = new User();
		model.addAttribute("registerForm", user);
		List<String> stateList = new ArrayList<String>();
		stateList.add("Karnataka");
		stateList.add("kerala");
		stateList.add("orissa");
		stateList.add("punjab");
		stateList.add("goa");
		model.addAttribute("stateList", stateList);
		return "userRegistrationForm";
	}

	@RequestMapping(value = "/userRegistration", method = RequestMethod.POST)
	public String signupUser(@ModelAttribute("registerForm") User user, Model model) {
		userService.insertUser(user);
		UserLogin login = new UserLogin();
		model.addAttribute("loginForm", login);
		return "userLoginForm";
	}

	@RequestMapping(value = "/adminRegister", method = RequestMethod.POST)
	public String registeradmin(@ModelAttribute("registerForm") User user, Model model) {
		// userService.insertUser(user);

		// model.addAttribute("loginForm",login);
		return "adminRegistrationForm";
	}

	@RequestMapping(value = "/adminRegistration", method = RequestMethod.POST)
	public String addAdmin(@ModelAttribute("registerForm") User user, Model model) {
		// userService.insertUser(user);

		// model.addAttribute("loginForm",login);
		return "superAdminHome";
	}

	@RequestMapping(value = "/userLoginSubmit", method = RequestMethod.POST)
	public String loginModelAttribute(@ModelAttribute("loginForm") UserLogin user, Model model, HttpSession session) {
		// System.out.println(user.getEmailId() +" " +user.getPasswrd());
		
		
		
		Map<String, Object> dataMap = userService.userLogin(user.getEmailId(), user.getPasswrd());
		model.addAttribute("dataMap", dataMap);

		if (dataMap.get("message") == null) {
			session.setAttribute("dataMap", dataMap);
			System.out.println(dataMap.get("role"));
			if (dataMap.get("role").equals("user"))
				return "userHome";
			else if (dataMap.get("role").equals("admin"))
				return "adminHome";
			else if (dataMap.get("role").equals("super_admin")) {
				return "superAdminHome";
			} else
				return "userLoginForm";
		} else{
			System.out.println(dataMap.get("message"));
			return "userLoginForm";
		}

	}

	@RequestMapping(value = "/addProductForm", method = RequestMethod.GET)
	public String productForm(Model model, HttpSession session) {
		Product product = new Product();
		model.addAttribute("addProductForm", product);

		// Map<String,Object> dataMap = (Map<String, Object>)
		// session.getAttribute("dataMap");
		// model.addAttribute("dataMap", dataMap);

		List<String> categoryList = new ArrayList<String>();
		categoryList.add("Electronics");
		categoryList.add("HomeAppliances");
		categoryList.add("Sports");
		categoryList.add("Books");
		model.addAttribute("categoryList", categoryList);
		return "addProduct";
	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("addProductForm") Product product, Model model, HttpSession session) {
		Map<String, Object> dataMap = (Map<String, Object>) session.getAttribute("dataMap");
		String response = productService.addProduct(product);

		List<User> userList = userService.getUsersByRoleId(0);
		dataMap.put("userList", userList);

		if (response.equals("SUCCESFUL_UPDATE")) {
			List<Product> productList = productService.getProducts();
			dataMap.put("productList", productList);
		} else {

			dataMap.put("prod_add_message", response);
		}

		model.addAttribute("dataMap", dataMap);

		if (dataMap.get("role").equals("admin"))
			return "adminHome";
		else
			return "superAdminHome";
	}

	@RequestMapping(value = "/deleteProduct", method = RequestMethod.GET)
	public String deleteProduct(@RequestParam("pId") long productId, Model model) {
		productService.RemoveProduct(productId);
		return "adminHome";
	}

}
