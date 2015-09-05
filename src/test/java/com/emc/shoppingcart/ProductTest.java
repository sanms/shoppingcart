package com.emc.shoppingcart;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.emc.shoppingcart.model.Product;
import com.emc.shoppingcart.services.ProductService;


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml","file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@ContextConfiguration(locations={"classpath:servlet-context.xml","classpath:root-context.xml"})
public class ProductTest {

	@Autowired
	ProductService productService;
	
	@Test
	public void getproducts() {
		List<Product> productList = productService.getProducts();
		System.out.println(productList.size());
		assertFalse(productList.isEmpty());
	}
}
