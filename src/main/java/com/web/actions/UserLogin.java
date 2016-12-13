package com.web.actions;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.web.model.User;


public class UserLogin extends ActionSupport implements ModelDriven<User> {
	private static final String SUCCESS = "SUCCESS";


	public UserLogin() {
	}

	public String showXML() {
		return SUCCESS;
	}

	public String saveXML() {
		return SUCCESS;
	}

	@Override
	public User getModel() {
		return null;
	}

	
}
