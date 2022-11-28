package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.dto.ExerciseVO;

public interface ExerciseService {
	List<ExerciseVO> selectBoardList();
	void registBoard(ExerciseVO evo);
}
