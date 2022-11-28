package com.semi.action.matching;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.semi.action.Action;
import com.semi.dto.MemberVO;
import com.semi.service.MemberService;
import com.semi.util.AjaxUtil;

public class MatchingHomeWomanAction implements Action {
	
	private MemberService service;
	public void setMemberService(MemberService service) {
		this.service = service;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception,IndexOutOfBoundsException {
		String url = null;
		
		// db 데이터
		List<MemberVO> bodyList =  service.selectMathBodyList();
		List<MemberVO> charList =  service.selectMathCharacterList();
		List<MemberVO> faceList =  service.selectMathFaceList();
		List<MemberVO> hobbyList =  service.selectMathHobbyList();
		List<MemberVO> memberList = service.selectMemberAllList();
		
		//jsp 데이터
		String resultHeight = request.getParameter("heightOption");
		String resultBody = request.getParameter("bodyOption");
		String[] resultFace = request.getParameterValues("faceOptions");
		String[] resultChar = request.getParameterValues("charOptions");
		String[] resultHobby = request.getParameterValues("hobbyOptions");
		String resultMBTI = request.getParameter("mbtiOption");
		
		
		//  db / jsp 비교 후 매칭 될 데이터
		
		List<String> matchingBody = new ArrayList<String>();
		List<String> matchingChar = new ArrayList<String>();
		List<String> matchingFace = new ArrayList<String>();
		List<String> matchingHobby = new ArrayList<String>();
		List<String> matchingHeight = new ArrayList<String>();
		List<String> matchingMBTI = new ArrayList<String>();
		
		List<MemberVO> memberMatching = new ArrayList<MemberVO>();

//		 null 값인 리스트에 값 미리 넣어주기 // 초기화면 이렇게 만들어야함
		memberMatching = service.selectMemberAllList();
		for (int i = 0; i < memberMatching.size(); i++) {
			Collections.shuffle(memberMatching);
			String nullId = memberMatching.get(i).getMemberId();
			
		}
//		
		
		System.out.println("------------------------------");
		
		
		for (MemberVO bl : bodyList) {
			if (bl.getMyBody().equals(resultBody)) {
				matchingBody.add(bl.getMemberId());
			}
		}
		System.out.println("matchingbody"+matchingBody);
		
		for (MemberVO ch : charList) {
			if (resultChar != null) {
				for (int i = 0; i < resultChar.length; i++) {
					if (ch.getMyCharacter().equals(resultChar[i])) {
						matchingChar.add(ch.getMemberId());
					}
				} 
			}
		}
		System.out.println("matchingchar"+matchingChar);
		
		for (MemberVO fa : faceList) {
			if (resultFace != null) {
				for (int i = 0; i < resultFace.length; i++) {
					if (fa.getMyFace().equals(resultFace[i])) {
						matchingFace.add(fa.getMemberId());
						
						}
					} 
				}
			
			}
		System.out.println("matchingface"+ matchingFace);
		
		for (MemberVO ho : hobbyList) {
			if (resultHobby != null) {
				for (int i = 0; i < resultHobby.length; i++) {
					if (ho.getMyHobby().equals(resultHobby[i])) {
							matchingHobby.add(ho.getMemberId());
						
						}
					} 
				}

			}
		System.out.println("matchinghobby"+matchingHobby);
			
		
//		// 키랑 mbti 비교 라인
//		for (MemberVO ml : memberList) {
//			if (ml.getMyHeight().equals(resultHeight)) {
//				matchingHeight.add(ml.getMemberId());
//			}
//			if (ml.getMyMbti().equals(resultMBTI)) {
//				matchingMBTI.add(ml.getMemberId());
//			}
//		}
		System.out.println("matchingHeight"+matchingHeight);
		System.out.println("matchingMBTI"+matchingMBTI);
		
		//교집합, 합집합을 한번에 처리하기 위한 값
		List<String> matchingAll = new ArrayList<String>();
		
		// 교집합
		// 교집합 뭐엇을 할지 정하면 될듯. 얼굴, 취미, 성격 3가지를 교집합함.
		matchingAll.addAll(matchingHobby);
		matchingAll.addAll(matchingChar);
		matchingAll.addAll(matchingFace);
		System.out.println("교집합" + matchingAll.toString());
		
		//합집합. 위에 교집합을 한 face에 나머지를 합집합 처리함.
		matchingAll.addAll(matchingBody);
		matchingAll.addAll(matchingHeight);
		matchingAll.addAll(matchingMBTI);
		
		System.out.println("합집합" + matchingAll.toString());
		
		//arrayList 중복제거
		HashSet<String> hash1 = new HashSet<String>();
		hash1.addAll(matchingAll);
		
		//Hashset 출력
		Iterator iterator = hash1.iterator();
		while (iterator.hasNext()) {
			System.out.println("중복제거 ID"+ iterator.next());
		}
		
		// set을 arraylist에 넣기
		List<String> finalMatching = new ArrayList<String>(hash1);
		MemberVO mv = null;
		//랜덤 매칭상대 뽑기
		if (finalMatching != null) {
			Collections.shuffle(finalMatching);
			for (int i = 0; i < finalMatching.size(); i++) {
//				matchingMember = (List<String>) service.getMember(finalMatching.get(i));
				System.out.println("최종 매칭 상대 출력 :"+ finalMatching.get(i));
				mv = service.getMember(finalMatching.get(i));
				memberMatching.add(mv);
			
			}
		}
		System.out.println(mv);
		System.out.println(memberMatching);
		
		AjaxUtil.responseJson(response, memberMatching);
		request.setAttribute("memberMatching", memberMatching);
		
		
		
		return url;
	}

}