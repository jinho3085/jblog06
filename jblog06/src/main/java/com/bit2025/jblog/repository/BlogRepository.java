package com.bit2025.jblog.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit2025.jblog.vo.BlogVo;

@Repository
public class BlogRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	// 블로그 기본 생성
	public int insert(BlogVo vo) {
		return sqlSession.insert("blog.insert", vo);
	}
	
	// 블로그 정보 조회
	public BlogVo findById(String id){
		return sqlSession.selectOne("blog.findById", id);
	}
	
	// 블로그 기본 정보 수정 (타이틀,로고)
	public int update(BlogVo vo) {
		return sqlSession.update("blog.update", vo);
	}
}
