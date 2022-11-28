package com.semi.dao;

import java.sql.SQLException;
import java.util.List;

import com.semi.command.Criteria;
import com.semi.dto.MemberVO;

public interface MemberDAO {
	
	List<MemberVO> selectMemberList(Criteria cri)throws SQLException;
	
	int selectMemberListCount(Criteria cri)throws SQLException;
	
	MemberVO selectMemberById(String id)throws SQLException;
	
	
	// 회원 추가
	public void insertMember(MemberVO member) throws SQLException;
	
	// 회원 수정
	public void updateMember(MemberVO member) throws SQLException;
	
	// 회원정보 삭제
	void deleteMember(String id) throws SQLException;
	
	
	
	
	// 매칭 회원 체형 
	public List<MemberVO> selectMathBodyList() throws SQLException;
	
	// 매칭 회원 성격
	public List<MemberVO> selectMathCharacterList( ) throws SQLException;
	
	// 매칭 회원 얼굴
	public List<MemberVO> selectMathFaceList( ) throws SQLException;
	
	// 매칭 회원 취미
	public List<MemberVO> selectMathHobbyList() throws SQLException;

	List<MemberVO> selectMemberAllList() throws SQLException;
	

}	
