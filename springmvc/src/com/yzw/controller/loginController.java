package com.yzw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {
	@RequestMapping("/login")
	public String login(String username, String password){
		if (!"yzw".equals(username)) {
			return "loginError";
		}
		return "loginSuccess";
		
	}
}
