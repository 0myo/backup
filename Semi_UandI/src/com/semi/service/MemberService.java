package com.semi.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.semi.command.Criteria;
import com.semi.dto.MemberVO;

public interface MemberService {
	
	//회원목록조회  //map으로 바뀌는거 무슨이유라고???
	Map<String,Object> getMemberList(Criteria cri)throws SQLException;
	
	//회원상세조회
	MemberVO getMember(String id)throws SQLException;	

	//회원등록
	public void regist(MemberVO member) throws Exception;
	
	//회원수정
	public void modify(MemberVO member)throws Exception;
	
	//회원탈퇴
	public void remove(String id)throws Exception; 
	
	
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
