package com.yzw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName:loginController
 * @Description:TODO
 * @author: acer
 * @date 2017年9月28日上午11:44:40
 */
@RequestMapping("/LoginController")
@Controller
public class LoginController {
	/**
	 * @Title: login
	 * @Description: TODO
	 * @param @param username
	 * @param @param password
	 * @param @return
	 * @return String
	 * @throws
	 *
	 */
	@RequestMapping("/login")
	public String login(String username, String password){
		if (!"yzw".equals(username)) {
			return "loginError";
		}
		return "loginSuccess";
		
	}
}
