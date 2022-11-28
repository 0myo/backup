package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.dto.ExerciseVO;

public interface ExerciseDAO {
	
	List<ExerciseVO> selectBoardList();
	void registBoard(ExerciseVO evo);
}
