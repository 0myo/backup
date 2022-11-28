package com.team.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.team.action.Action;
import com.team.dto.MemberVO;
import com.team.service.MemberService;

public class MemberRemoveAction implements Action {
	
	private MemberService memberService;
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url = "/member/remove_success";
		String id = request.getParameter("id");
		MemberVO member = null;
		try {
			member = memberService.getMember(id);
			memberService.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// loginUser 확인
		HttpSession session = request.getSession();
		MemberVO loginUser = (MemberVO) session.getAttribute("loginUser");
		if (loginUser != null && member.getId().equals(loginUser.getId())) {
			session.invalidate();
		}

		request.setAttribute("member", member);

		return url;
	}

}
