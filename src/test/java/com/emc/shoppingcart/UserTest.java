package com.emc.shoppingcart;

import java.util.List;
 
import static org.junit.Assert.*; 

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.emc.shoppingcart.model.User;
import com.emc.shoppingcart.services.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml","file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@ContextConfiguration(locations={"classpath:servlet-context.xml","classpath:root-context.xml"})
public class UserTest {
	
	@Autowired
	UserService userService;
	
	@Test
	public void testGetUsersByRoleId(){
		System.out.println("test");
		List<User> userlist=userService.getAllUsers();
		for(User user:userlist){
			System.out.println(user.getUserFname());
		}
		assertFalse(userlist.isEmpty());
	}
	
	
	public void UserLogin(){
		
		String username=null;
		String passWord="";
		
	
		
	}
	
}
