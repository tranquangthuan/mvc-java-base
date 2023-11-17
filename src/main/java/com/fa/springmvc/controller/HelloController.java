package com.fa.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/hello")
public class HelloController {

	@GetMapping("hello")
	public String index() {
		System.out.println("Hello method");
		return "hello";
	}
}
