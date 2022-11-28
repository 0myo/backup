<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>


<c:set var="pageMaker" value="${dataMap.pageMaker}"/>
<c:set var="cri" value="${dataMap.pageMaker.cri }"/>
<c:set var="memberList" value="${dataMap.memberList }"/>

<div>
<h1>회원목록</h1>



<div class="input-group row">
<select name="perPageNum" id="perPageNum">
	<option value="10" ${cri.perPageNum eq 10 ? 'selected' : ''} >정렬개수</option>
	<option value="2" ${cri.perPageNum eq 2 ? 'selected' : ''}>2개</option>
	<option value="3" ${cri.perPageNum eq 3 ? 'selected' : ''}>3개</option>
	<option value="5" ${cri.perPageNum eq 5 ? 'selected' : ''}>5개</option>
</select>
<select id="searchType" name="searchType">
	<option value="">검색조건</option>
	<option value="i" ${cri.searchType eq "i" ? 'selected' : '' }>아이디</option>
	<option value="n" ${cri.searchType eq "n" ? 'selected' : '' }>이름</option>
	<option value="p" ${cri.searchType eq "p" ? 'selected' : '' }>전화번호</option>
	<option value="e" ${cri.searchType eq "e" ? 'selected' : '' }>이메일</option>
</select>
<input type="text" name="keyword" placeholder="검색어를 입력하세요." value="${cri.keyword }"/>
<input type="button" value = "검색" onclick="list_go(1)">

</div>

<table border="1">
<tr>
	<th>사진</th>
	<th>아이디</th>
	<th>이름</th>
	<th>전화번호</th>
	<th>이메일</th>
	<th>주소</th>
</tr>
<c:if test="${!empty memberList}">

<c:forEach items="${ memberList}" var="member">
	<tr onclick="OpenWindow('<%=request.getContextPath()%>/member/detail.do?id=${member.id}','회원상세',700,800);">
		<td><div class="manPicture" data-id="${member.id }"></div></td>
		<td>${member.id}</td>
		<td>${member.name }</td>
		<td>${member.phone.replace('-','') }</td>
		<td>${member.email }</td>
		<td>${member.address }</td>
	</tr>
</c:forEach>
</c:if>
<c:if test="${empty memberList }">
	<tr>
		<td colspan="6">해당 내용이 없습니다.</td>
	</tr>
</c:if>
</table>
<input type="button" onclick="OpenWindow('../member/registForm.do','회원등록',600,700);" value="등록"/>

<div class="card-footer">
	<%@ include file="/WEB-INF/views/include/pagination.jsp" %>
</div>


</div>



