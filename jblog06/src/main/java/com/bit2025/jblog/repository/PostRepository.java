package com.bit2025.jblog.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit2025.jblog.vo.PostVo;

@Repository
public class PostRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	// 포스트 등록
	public int insert(PostVo vo) {
		return sqlSession.insert("post.insert", vo);
	}
	
	// 특정 카테고리의 글 목록
	public List<PostVo> findByCategoryNo(Long categoryNo) {
		return sqlSession.selectList("post.findByCategoryNo", categoryNo);
	}
	
	// 최신 글
	public PostVo findLatestByBlogId(String blogId) {
		return sqlSession.selectOne("post.findLastestByBlogId", blogId);
	}
}
