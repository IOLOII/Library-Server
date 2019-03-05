package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("hello")
@RequestMapping("/Hello")
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(){
//		返回值为view层文件名(路径)
		return "hello";
	}
}