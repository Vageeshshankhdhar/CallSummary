package com.trainingbasket.loginapp.services;


import java.util.Map;

import com.trainingbasket.loginapp.beans.User;
import com.trainingbasket.loginapp.dao.DataAccess;

public class LoginServices {
	
	DataAccess access=null;
	public LoginServices() {
		access = new DataAccess();
		
	}

	public boolean authenticateUser(String userName, String password) {
		Map<String,User> users =access.getAllUsers();
		User user= users.get(userName);
		if(user.getName().equals(userName)&&user.getPassword().equals(password)) {
		return true;	
		}
		return false;
	}

	public int resetPassword(String username, String oldPassword, String newPassword) {
		User user = new User();
		user.setName(username);
		user.setPassword(oldPassword);
		access.UpdateUser(user, newPassword);
		return 0;
	}

	public int AddUser(String username, String password) {
		User user =new User();
		user.setName(username);
		user.setPassword(password);
		access.saveUser(user);
		return 0;
	}

	public int deleteUser(String username) {
		User user =new User();
		user.setName(username);
		access.deleteUser(user);
		return 0;
	}

}
