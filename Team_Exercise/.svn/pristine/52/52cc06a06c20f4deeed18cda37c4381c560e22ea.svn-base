<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
	<h1>회원 상세</h1>
	<label for="id">아이디</label>
	<input disabled type="text" id="id" value="${member.id}" name="id"/><br>
	<label for="pwd">비밀번호</label>
	<input disabled type="password" id="pdw" value="${member.pwd}" name="pwd"/><br>
	<label for="name">이  름</label>
	<input disabled  type="text" id="name" value="${member.name}" name="name"/><br>
	<label for="email">이메일</label>
	<input disabled  type="email" id="emaill" value="${member.email}" name="email"/><br>
	<label for="phone">전화번호</label>
	<input disabled type="text" value="${member.phone}" />
	<br>
	
	<input type="button" value="수정"/>
	<input type="button" value="삭제" onclick="location.href='remove.do?id=${member.id}';"/>
	<input type="button" onclick="CloseWindow();" value="취소"/>
</div>