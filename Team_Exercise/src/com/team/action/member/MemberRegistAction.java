package com.team.action.member;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team.action.Action;

import com.team.service.MemberService;

public class MemberRegistAction implements Action {
	
	private MemberService memberService;
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url = "/member/regist_success";
		
		try {
			request.getParameter("member");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			url="/member/regist_fail";
		}
		return url;
	}
		
	
}
