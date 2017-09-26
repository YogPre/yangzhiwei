package com.yzw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloWordController {
	 @RequestMapping("/hello")
	    public String hello() {
	            return "hello"; // 跳转helloworld.jsp
	    }

}
