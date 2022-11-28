package com.jsp.action.free;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.action.Action;
import com.jsp.command.Criteria;
import com.jsp.command.CriteriaCommand;
import com.jsp.controller.HttpRequestParameterAdapter;
import com.jsp.service.FreeService;


public class FreeListAction implements Action {
	
	private FreeService freeService;
	public void setFreeService(FreeService freeService) {
		this.freeService = freeService;
	}
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url = "/free/list";
		
		
		CriteriaCommand criCom 
			= HttpRequestParameterAdapter.execute(request, CriteriaCommand.class);
		
		Criteria cri=criCom.toCriteria();
		
		
		Map<String,Object> dataMap = freeService.getFreeList(cri);
		
		request.setAttribute("dataMap",dataMap);
		
		
		return url;
	}

}