package com.bit2025.jblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bit2025.jblog.service.BlogService;
import com.bit2025.jblog.vo.BlogVo;

@Controller
public class BlogController {
	
	@Autowired
    private BlogService blogService;

    // 블로그 메인 페이지
    @GetMapping("/{id}")
    public String blogMain(@PathVariable("id") String id, Model model) {
        BlogVo blogVo = blogService.getBlog(id);
        model.addAttribute("blog", blogVo);
        return "blog/main";
    }

    // 블로그 기본 정보 수정 폼
    @GetMapping("/{id}/admin/basic")
    public String adminBasicForm(@PathVariable("id") String id, Model model) {
        BlogVo blogVo = blogService.getBlog(id);
        model.addAttribute("blog", blogVo);
        return "blog/admin-basic";
    }

    // 블로그 기본 정보 수정 처리
    @PostMapping("/{id}/admin/basic")
    public String adminBasic(@PathVariable("id") String id, BlogVo vo) {
        vo.setBlogId(id);
        blogService.updateBlog(vo);
        return "redirect:/{id}/admin/basic";
		
	}
}
