package com.bit2025.jblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	// 사이트 메인(index)
    @GetMapping("/")
    public String main() {
        return "main/index";
    }
}
