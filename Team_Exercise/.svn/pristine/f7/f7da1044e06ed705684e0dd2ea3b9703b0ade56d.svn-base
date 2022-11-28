package com.team.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team.action.Action;
import com.team.dto.MemberVO;
import com.team.service.MemberService;

public class MemberDetailAction implements Action {
	
	private MemberService memberService;
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url = "/member/detail";
		String id = request.getParameter("id");
		try {
			MemberVO member = memberService.getMember(id);
			
			request.setAttribute("member", member);
			
		}catch(Exception e) {
			e.printStackTrace();
			// ........
			url = "/member/detail_fail";
			//response.sendError(response.SC_INTERNAL_SERVER_ERROR);
		}

		return url;
	}

}
