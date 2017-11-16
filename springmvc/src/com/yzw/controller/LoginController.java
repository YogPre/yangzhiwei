package com.yzw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yzw.entity.userEntity;
import com.yzw.service.user.IUserService;
import com.yzw.service.user.impl.UserServiceImpl;

/**
 * @ClassName:loginController
 * @Description:TODO
 * @author: acer
 * @date 2017年9月28日上午11:44:40
 */
@RequestMapping("/LoginController")
@Controller
public class LoginController {
	@Autowired
	private IUserService iUserService;
	/**
	 * @Title: login
	 * @Description: 登录验证
	 * @param @param username
	 * @param @param password
	 * @param @return
	 * @return String
	 * @throws
	 *
	 */
	@RequestMapping("/login")
	public String login(String username, String password){
		userEntity user = iUserService.checkLogin(username, password);
		if (user != null) {
			return "loginError";
		}
		return "loginSuccess";
	}
	public static void main(String[] args) {
		IUserService iUserService = new UserServiceImpl();
		userEntity user = iUserService.checkLogin("134","afd");
		System.out.println(user.getName());
	}
}
