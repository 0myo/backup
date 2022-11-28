package com.semi.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.semi.command.Criteria;
import com.semi.command.PageMaker;
import com.semi.dao.MemberDAO;
import com.semi.dto.MemberVO;

public class MemberServiceImpl implements MemberService {

	private MemberDAO memberDAO;
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	@Override
	public Map<String, Object> getMemberList(Criteria cri) throws SQLException {
		
		Map<String, Object> dataMap = null;
		
		//처리
		List<MemberVO> memberList = memberDAO.selectMemberList(cri);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(memberDAO.selectMemberListCount(cri));
		
		dataMap = new HashMap<String,Object>();
		dataMap.put("memberList", memberList);
		dataMap.put("pageMaker", pageMaker);
		
		
		return dataMap;
	}

	@Override
	public MemberVO getMember(String id) throws SQLException {
		MemberVO member = memberDAO.selectMemberById(id);
		return member;
	}
	
	@Override
	public void regist(MemberVO member) throws Exception {
		memberDAO.insertMember(member);
		
	}

	@Override
	public void modify(MemberVO member) throws Exception {
		memberDAO.updateMember(member);		
	}

	@Override
	public void remove(String id) throws Exception {
		memberDAO.deleteMember(id);		
	}

	@Override
	public List<MemberVO> selectMathBodyList() throws SQLException {
		
		List<MemberVO> bodyList = memberDAO.selectMathBodyList();
		return bodyList;
	}

	@Override
	public List<MemberVO> selectMathCharacterList() throws SQLException {
		List<MemberVO> charList = memberDAO.selectMathCharacterList();

		return charList;
	}

	@Override
	public List<MemberVO> selectMathFaceList() throws SQLException {
		List<MemberVO> faceList = memberDAO.selectMathFaceList();

		return faceList;
	}

	@Override
	public List<MemberVO> selectMathHobbyList() throws SQLException {
		List<MemberVO> hobbyList = memberDAO.selectMathHobbyList();

		return hobbyList;
	}
	
	@Override
	public List<MemberVO> selectMemberAllList() throws SQLException {
			List<MemberVO> memberList  = memberDAO.selectMemberAllList();
			return memberList;
	}

}
