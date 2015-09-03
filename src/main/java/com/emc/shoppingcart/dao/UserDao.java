package com.emc.shoppingcart.dao;

import java.util.List;
import java.util.Map;

import com.emc.shoppingcart.model.User;

public interface UserDao {

	public User getUser(String userName);
	public void insertUser(User user);
	public void deleteUser(String userName);
	public void updateuser(User user);
	public List<User> getAllUsers();
	public List<User> getUsersByRoleId(int rId);
}
