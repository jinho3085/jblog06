package com.bit2025.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit2025.jblog.repository.BlogRepository;
import com.bit2025.jblog.vo.BlogVo;

@Service
public class BlogService {
	
	@Autowired
	private BlogRepository blogRepository;
	
	// 블로그 정보 가져오기
	public BlogVo getBlog(String id) {
		return blogRepository.findById(id);
	}
	
	// 블로그 기본 정보 수정
	public void updateBlog(BlogVo vo) {
		blogRepository.update(vo);
	}
}
