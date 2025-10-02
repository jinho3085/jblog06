package com.bit2025.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit2025.jblog.repository.BlogRepository;
import com.bit2025.jblog.repository.CategoryRepository;
import com.bit2025.jblog.repository.UserRepository;
import com.bit2025.jblog.vo.BlogVo;
import com.bit2025.jblog.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	public void join(UserVo vo) {
		// 1. 회원가입
		userRepository.insert(vo);
		
		// 2. 블로그 생성
		BlogVo blogVo = new BlogVo();
		blogVo.setBlogId(vo.getId());
		blogVo.setTitle(vo.getName() + "의 블로그");
		blogRepository.insert(blogVo);
		
		// 3 기본 카테고리 생성
		categoryRepository.insertDefault(blogVo.getBlogId());
		
	}
	
	// 로그인(id로 유저 가져오기)
	public UserVo getUser(String id) {
		return userRepository.findById(id);
	}
}
