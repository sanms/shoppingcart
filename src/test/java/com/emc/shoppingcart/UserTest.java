package com.emc.shoppingcart;

import java.util.List;
 
import static org.junit.Assert.*; 


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emc.shoppingcart.dao.UserDao;
import com.emc.shoppingcart.dao.UserDaoImpl;
import com.emc.shoppingcart.model.User;

public class UserTest {

	/*ClassPathXmlApplicationContext context= 
			new ClassPathXmlApplicationContext("root-context.xml","servlet-context.xml");
	
	//@Autowired
	UserDao userDao=context.getBean("userDaoImpl",UserDaoImpl.class);
	
	@Test
	public void testGetUsersByRoleId(){
		System.out.println("test");
		List<User> userlist=userDao.getAllUsers();
		assertFalse(userlist.isEmpty());
		for(User user:userlist){
			System.out.println(user.getUserFname());
		}
	}*/
	
}
