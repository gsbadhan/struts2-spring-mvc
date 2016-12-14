package com.we.interceptors;

import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@Component("incomingOutgoingLogging")
public class IncomingOutgoingLogging implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		System.out.println("InRequest:" + actionInvocation.getStack());
		return actionInvocation.invoke();
	}

}
