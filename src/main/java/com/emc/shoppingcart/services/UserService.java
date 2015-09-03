package com.emc.shoppingcart.services;

import java.util.Map;

import com.emc.shoppingcart.model.User;

public interface UserService {
	public Map<String,Object> userLogin(String userName,String passwrd);
	public void insertUser(User user);
}
