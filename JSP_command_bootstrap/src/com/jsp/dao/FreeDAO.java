package com.jsp.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jsp.command.Criteria;
import com.jsp.dto.FreeVO;

public interface FreeDAO {
	
	List<FreeVO> selectSearchFreeList(SqlSession session, Criteria cri) throws SQLException;
	
	int selectSearchFreeListCount(SqlSession session, Criteria cri) throws SQLException;
	
	FreeVO selectFreeByNno(SqlSession session, int nno) throws SQLException;
	
	// viewcnt 증가
	void increaseViewCount(SqlSession session, int nno) throws SQLException;
	
	// Free_seq.nextval 가져오기
	int selectFreeSequenceNExtValue(SqlSession session) throws SQLException;
	
	void insertFree(SqlSession session, FreeVO Free) throws SQLException;
	
	void updateFree(SqlSession session, FreeVO Free) throws SQLException;
	
	void deleteFree(SqlSession session, int nno) throws SQLException;

}
