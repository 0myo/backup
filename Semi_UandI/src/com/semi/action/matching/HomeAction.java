package com.semi.action.matching;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.semi.action.Action;
import com.semi.dto.MemberVO;
import com.semi.service.MemberService;

public class HomeAction implements Action {

	private MemberService memberService;
	public void setSearchMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url = "/matching/home";
		
//		String id = request.getParameter("memberId");
		String id = "han";
		
		try {
			MemberVO member = memberService.getMember(id);
			
			request.setAttribute("member", member);
			
		}catch(Exception e) {
			e.printStackTrace();
			// ........
			url = "/member/home_fail";
			//response.sendError(response.SC_INTERNAL_SERVER_ERROR);
		}
		
		return url;
	}

}
