package com.bit2025.jblog.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit2025.jblog.vo.UserVo;

@Repository
public class UserRepository {

	@Autowired private SqlSession sqlSession; 
	
	// 회원가입 
	public int insert(UserVo vo) { 
		return sqlSession.insert("user.insert", vo); 
	} 
	
	// 로그인 - id로 사용자 정보 가져오기 
	public UserVo findById(String id) { 
		return sqlSession.selectOne("user.findById", id); 
	}
}
