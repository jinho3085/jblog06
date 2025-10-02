package com.bit2025.jblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bit2025.jblog.service.UserService;
import com.bit2025.jblog.vo.UserVo;

@Controller
public class UserController {
	
	@Autowired
    private UserService userService;

    // 회원가입 폼
    @GetMapping("/user/join")
    public String joinForm() {
        return "user/join";
    }

    // 회원가입 처리
    @PostMapping("/user/join")
    public String join(UserVo vo) {
        userService.join(vo);
        return "user/joinsuccess";
    }

    // 로그인 폼
    @GetMapping("/user/login")
    public String loginForm() {
        return "user/login";
    }

    // 로그인 처리 (간단 버전)
    @PostMapping("/user/login")
    public String login(String id, String password, Model model) {
        UserVo user = userService.getUser(id);
        if(user != null && user.getPassword().equals(password)) {
            model.addAttribute("user", user);
            return "redirect:/"+id;   // 로그인 성공 → 블로그 홈으로
        } else {
            model.addAttribute("result", "fail");
            return "user/login";
        }
    }
}
