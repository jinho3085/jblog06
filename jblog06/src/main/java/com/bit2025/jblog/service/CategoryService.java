package com.bit2025.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit2025.jblog.repository.CategoryRepository;
import com.bit2025.jblog.vo.CategoryVo;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	// 블로그 카테고리 목록
	public List<CategoryVo> getCategoryList(String blogId) {
		return categoryRepository.findBlogId(blogId);
	}
}
