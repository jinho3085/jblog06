package com.bit2025.jblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@GetMapping("/user/join")
	public String joinForm() {
		return "user/join";
	}
	
	// 회원가입 처리
	@PostMapping("/user/join")
	public String joinsuccess() {
		return "redirect:/";
	}
	
	@GetMapping("/user/login")
	public String loginForm() {
		return "user/login";
	}
	
	@PostMapping("/user/login")
	public String loginsuccess() {
		return "redirect:/";
	}
	
}
