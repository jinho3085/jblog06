package com.bit2025.jblog.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit2025.jblog.vo.CategoryVo;

@Repository
public class CategoryRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	// 블로그 생성시 기본 카테고리 자동 추가
	public int insertDefault(String blogId) {
		return sqlSession.insert("category.insertDefault", blogId);
	}
	
	// 블로그 카테고리 조회
	public List<CategoryVo> findBlogId(String blogId) {
		return sqlSession.selectList("category.findByBlogId", blogId);
	}
}
