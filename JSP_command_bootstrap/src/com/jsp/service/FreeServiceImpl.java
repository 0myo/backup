package com.jsp.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.jsp.command.Criteria;
import com.jsp.command.PageMaker;
import com.jsp.dao.FreeDAO;
import com.jsp.dto.FreeVO;

public class FreeServiceImpl  implements FreeService {
	
	private SqlSessionFactory sqlSessionFactory;
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	private FreeDAO freeDAO;
	public void setFreeDAO(FreeDAO freeDAO) {
		this.freeDAO = freeDAO;
	}

	@Override
	public Map<String, Object> getFreeList(Criteria cri) throws SQLException {

		SqlSession session = sqlSessionFactory.openSession();
		try {
			Map<String, Object> dateMap = new HashMap<String, Object>();
			
			// 현재 page 번호에 맞는 리스트를 perPageNum 개수 만큼 가져오기.
			List<FreeVO> freeList = freeDAO.selectSearchFreeList(session, cri);
			
			// 전체 board 개수
			int totalCount = freeDAO.selectSearchFreeListCount(session, cri);
			
			// PageMaker 생성.
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(cri);
			pageMaker.setTotalCount(totalCount);
			
			dateMap.put("freeList", freeList);
			dateMap.put("pageMaker", pageMaker);
			
			return dateMap;
		} finally {
			session.close();
		}
		
	}

	@Override
	public FreeVO getFree(int nno) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			FreeVO board = freeDAO.selectFreeByNno(session, nno);
			freeDAO.increaseViewCount(session, nno);
			return board;
		} finally {
			session.close();
		}
	}

	@Override
	public FreeVO getFreeForModify(int nno) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			FreeVO board = freeDAO.selectFreeByNno(session, nno);
			return board;
		} finally {
		session.close();
		}
	}

	@Override
	public void regist(FreeVO free) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			int nno = freeDAO.selectFreeSequenceNExtValue(session);
			free.setNno(nno);
			freeDAO.insertFree(session, free);
		} finally {		
			session.close();
		}
		
	}

	@Override
	public void modify(FreeVO free) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			freeDAO.updateFree(session, free);

		} finally {		
			session.close();
		}
	}

	@Override
	public void remove(int nno) throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			freeDAO.deleteFree(session, nno);

		} finally {		
			session.close();
		}
	}

}
