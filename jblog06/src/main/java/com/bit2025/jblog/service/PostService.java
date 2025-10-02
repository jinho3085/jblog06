package com.bit2025.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit2025.jblog.repository.PostRepository;
import com.bit2025.jblog.vo.PostVo;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	// 글 작성
	public void write(PostVo vo) {
		postRepository.insert(vo);
	}
	
	// 카테고리별 글 목록
	public List<PostVo> getPostList(Long categoryNo) {
		return postRepository.findByCategoryNo(categoryNo);
	}
	
	// 최신글 
	public PostVo getLatestPost(String blogId) {
		return postRepository.findLatestByBlogId(blogId);
	}
}
