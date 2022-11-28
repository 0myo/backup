package kr.or.ddit.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.dto.ExerciseVO;

public class ExerciseDAOImpl implements ExerciseDAO{
	
	
	private SqlSession session;
	public void setSession(SqlSession session) {
		this.session=session;
	}
	@Override
	public List<ExerciseVO> selectBoardList() {
		List<ExerciseVO> boardList 
		= session.selectList("Exercise-Mapper.selectBoardList");

		return boardList;
	}
	
	@Override
	public void registBoard(ExerciseVO evo) {
		session.insert("Exercise-Mapper.registBoard",evo);
    }
	
}
