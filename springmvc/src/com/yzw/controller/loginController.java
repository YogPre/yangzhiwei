package com.yzw.controller;

public class loginController {
	public String login(String name, String password){
		if (!"yzw".equals(name)) {
			return "loginError";
		}
		return "loginSuccess";
		
	}
}
