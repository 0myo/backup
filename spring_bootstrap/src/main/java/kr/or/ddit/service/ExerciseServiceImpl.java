package kr.or.ddit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kr.or.ddit.dao.ExerciseDAO;
import kr.or.ddit.dto.ExerciseVO;

public class ExerciseServiceImpl implements ExerciseService{
	@Autowired
	private ExerciseDAO edao;
	
	public void setExerciseDAO(ExerciseDAO edao) {
		this.edao=edao;
	}
	
	@Override
	public List<ExerciseVO> selectBoardList() {
		return edao.selectBoardList();
	}

	@Override
	public void registBoard(ExerciseVO evo) {
		edao.registBoard(evo);
	}

}
