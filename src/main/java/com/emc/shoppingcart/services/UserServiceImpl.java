package com.emc.shoppingcart.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emc.shoppingcart.dao.ProductDao;
import com.emc.shoppingcart.dao.RolesDao;
import com.emc.shoppingcart.dao.UserDao;
import com.emc.shoppingcart.model.Product;
import com.emc.shoppingcart.model.Roles;
import com.emc.shoppingcart.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Autowired
	RolesDao rolesDao;
	
	@Autowired
	ProductDao productDao;
	
	@Override
	public Map<String,Object> userLogin(String userName, String passwrd) {
		
		Map<String,Object> dataMap= new HashMap<String, Object>();
		
		User user=userDao.getUser(userName);
		if(passwrd.equals(user.getPasswrd())){
			
			Roles role=rolesDao.getRole(user.getR_id());
			
			 if(role.getrName().equals("admin")){
				 
				 dataMap.put("role", role.getrName());
				 dataMap.put("user", user);
				 
				 List<Product> productList=productDao.getProducts();
				 //List<User> userList=userDao.getAllUsers();
				 List<User> userList=userDao.getUsersByRoleId(0);
				 List<User> adminList=userDao.getUsersByRoleId(1);
				 
				 
				 dataMap.put("productList", productList);
				 dataMap.put("userList", userList);
				 dataMap.put("adminList",adminList);
				 
				 return dataMap;
			 }
			 //else if(role.getrName().equals("user"))
			 else
			 {
				 dataMap.put("role", role.getrName());
				 dataMap.put("user", user);
				 
				 List<Product> productList=productDao.getProducts();
				 
				 dataMap.put("productList", productList);
				 return dataMap;
			 }
			 
		}else{
			dataMap.put("message","password not correct");
			return dataMap;
		}
			
	}

	@Override
	public void insertUser(User user) {
		
		userDao.insertUser(user);
	}
	
	
	

}
