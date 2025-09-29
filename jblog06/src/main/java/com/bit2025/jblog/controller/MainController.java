package com.bit2025.jblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	// 홈페이지
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	// 블로그 페이지
	@GetMapping("/main")
	public String blog() {
		return "main";
	}
	
}
