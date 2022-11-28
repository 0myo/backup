package com.jsp.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.jsp.command.Criteria;
import com.jsp.dto.FreeVO;

public class FreeDAOImpl implements FreeDAO {

	@Override
	public List<FreeVO> selectSearchFreeList(SqlSession session, Criteria cri) throws SQLException {
		
		int startRow = cri.getStartRowNum();
		int endRow = startRow + cri.getPerPageNum()+1;
		
		Map<String, Object> dataParam = new HashMap<String, Object>();
		dataParam.put("startRow", startRow);
		dataParam.put("endRow", endRow);
		dataParam.put("SearchType", cri.getSearchType());
		dataParam.put("Keyword", cri.getKeyword());
		
		List<FreeVO> freeList = session.selectList("Free-Mapper.selectSearchFreeList", dataParam);
		
		return freeList;
	}

	@Override
	public int selectSearchFreeListCount(SqlSession session, Criteria cri) throws SQLException {
		int count = session.selectOne("Free-Mapper.selectSearchFreeListCount", cri);
		return count;
	}

	@Override
	public FreeVO selectFreeByNno(SqlSession session, int nno) throws SQLException {
		FreeVO free = session.selectOne("Free-Mapper.selectFreeByNno", nno);
		return free;
	}

	@Override
	public void increaseViewCount(SqlSession session, int nno) throws SQLException {
		session.update("Free-Mapper.increaseViewCount", nno);
		
	}

	@Override
	public int selectFreeSequenceNExtValue(SqlSession session) throws SQLException {
		int seq_num = session.selectOne("Free-Mapper.selectFreeSequenceNextValue");
		return seq_num;
	}

	@Override
	public void insertFree(SqlSession session, FreeVO free) throws SQLException {
		session.update("Free-Mapper.insertFree", free);
		
	}

	@Override
	public void updateFree(SqlSession session, FreeVO free) throws SQLException {
		session.update("Free-Mapper.updateFree", free);
		
	}

	@Override
	public void deleteFree(SqlSession session, int nno) throws SQLException {
		session.update("Free-Mapper.deleteFree", nno);
		
	}
}

	