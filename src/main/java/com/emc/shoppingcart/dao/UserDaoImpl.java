package com.emc.shoppingcart.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.emc.shoppingcart.mappers.UserRoleMapper;
import com.emc.shoppingcart.model.User;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
		
	@Override
	public User getUser(String userName) {
		String sql="select * from user where email_id=?";
		
		User user=jdbcTemplate.queryForObject(sql, new Object[]{userName}, new BeanPropertyRowMapper<User>(User.class));
		//User user=jdbcTemplate.queryForObject(sql, new Object[]{userName}, new UserRoleMapper());
		return user;
	}

	@Override
	public void insertUser(User user) {
		
		String sql="insert into user(user_lname,user_fname,email_id,passwrd,address_line1,address_line2,phone_number,gender,r_id) values(?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, user.getUserLname(),user.getUserFname(),user.getEmailId(),user.getPasswrd(),user.getAddressLine1(),
				user.getAddressLine2(),user.getPhoneNumber(),user.getGender(),0);
	}

	@Override
	public void deleteUser(String userName) {
		String sql="delete from user where email_id=?";
		jdbcTemplate.update(sql, userName);
		
	}

	@Override
	public void updateuser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAllUsers() {
		String sql="select * from user";
		List<User> userList=jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
		return userList;
	}

	@Override
	public List<User> getUsersByRoleId(int rId) {
		String sql="select * from user where r_id=?";
		List<User> userListByRole;
		userListByRole=jdbcTemplate.query(sql, new Object[]{rId}, new BeanPropertyRowMapper<User>(User.class));
		
		return userListByRole;
	}
	
	

}
