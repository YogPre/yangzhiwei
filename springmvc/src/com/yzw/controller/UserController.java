package com.yzw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName:helloWordController
 * @Description:TODO
 * @author: acer
 * @date 2017年9月28日上午11:46:53
 */
@RequestMapping("/UserController")
@Controller
public class UserController {
	/**
	 * @Title: hello
	 * @Description: TODO
	 * @param @return
	 * @return String
	 * @throws
	 *
	 */
	@RequestMapping("/hello")
	public String hello() {
		return "hello"; // 跳转helloworld.jsp
	}

}
