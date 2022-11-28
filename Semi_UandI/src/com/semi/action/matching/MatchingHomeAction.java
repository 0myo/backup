package com.semi.action.matching;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.semi.action.Action;

public class MatchingHomeAction implements Action {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url ="/matching/matchingHome_W" ;
		return url;
	}

}
