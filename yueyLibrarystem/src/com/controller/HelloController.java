package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Hello")
public class HelloController {
@RequestMapping("/hello")
public String hello(){
    return "hello";
}
}