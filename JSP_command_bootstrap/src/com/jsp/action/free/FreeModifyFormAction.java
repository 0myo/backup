package com.jsp.action.free;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.action.Action;
import com.jsp.dto.FreeVO;
import com.jsp.service.FreeService;

public class FreeModifyFormAction implements Action {
	

	private FreeService freeService;
	public void setFreeService(FreeService freeService) {
		this.freeService = freeService;
	}
	
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url = "/free/modify";
		
		int nno = Integer.parseInt(request.getParameter("nno"));
		
		FreeVO free = freeService.getFreeForModify(nno);
		
		request.setAttribute("free", free);
		
		
		return url;
	}

}
