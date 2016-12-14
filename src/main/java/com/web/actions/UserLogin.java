package com.web.actions;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.web.model.User;

@Service
public class UserLogin extends ActionSupport implements ModelDriven<User> {
	private static final String SUCCESS = "SUCCESS";

	private User user;

	@Inject
	public UserLogin(User user) {
		this.user = user;
	}

	public String showLoginPage() {
		return SUCCESS;
	}

	public String validateUser() {
		System.out.println("user object:" + user);
		
		return SUCCESS;
	}

	@Override
	public User getModel() {
		return user;
	}
	
	

}
