package com.web.actions;

import javax.inject.Inject;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.web.model.User;

public class UserLogin extends ActionSupport implements ModelDriven<User> {
	private static final String SUCCESS = "SUCCESS";

	private User user;

	public UserLogin() {
		System.out.println("hh");
	}

	public String showLoginPage() {
		return SUCCESS;
	}

	public String saveXML() {
		return SUCCESS;
	}

	@Override
	public User getModel() {
		return user;
	}

}
