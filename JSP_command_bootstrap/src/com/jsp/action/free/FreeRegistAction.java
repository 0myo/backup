package com.jsp.action.free;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.action.Action;
import com.jsp.controller.HttpRequestParameterAdapter;
import com.jsp.dto.FreeVO;
import com.jsp.service.FreeService;

public class FreeRegistAction implements Action {
	
	private FreeService freeService;
	public void setFreeService(FreeService freeService) {
		this.freeService = freeService;
	}
	
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url="/free/regist_success";
		
		FreeVO free = HttpRequestParameterAdapter.execute(request,FreeVO.class);
		
		freeService.regist(free);
		
		return url;
	}

}

