package kr.or.ddit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.or.ddit.dto.ExerciseVO;
import kr.or.ddit.service.ExerciseService;

@Controller
@RequestMapping("/exercise")
public class ExerciseController {
	@Autowired
	private ExerciseService exerciseService;
	@RequestMapping("/main")
	public void main(Model model){
		model.addAttribute("category","Exercise");
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		String url = "exercise/list";
		
		List<ExerciseVO> eList = exerciseService.selectBoardList();
		model.addAttribute("eList",eList);
		return url;
	}
	@RequestMapping("/registForm")
	public void registForm() {
		
	}
	@RequestMapping("/regist")
	public String regist(ExerciseVO evo,RedirectAttributes rttr) {
		String url = "redirect:/exercise/list.do";
		exerciseService.registBoard(evo);
		rttr.addFlashAttribute("from","regist");
		
		return url;
	} 
}
