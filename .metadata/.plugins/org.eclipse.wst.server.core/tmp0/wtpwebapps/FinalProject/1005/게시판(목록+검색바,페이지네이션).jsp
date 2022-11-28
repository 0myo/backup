<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!-- ================================================= -->
<!-- MAIN-CONTENT -->
<!-- ================================================= -->
<div class="container-fluid">





<div class="row">
	<div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
	
	<!-- ================================================= -->
	<!-- 카드 시작 -->
	<!-- ================================================= -->
	<div class="card">
	
	<!-- ================================================= -->
	<!-- 카드바디 시작 -->
	<!-- ================================================= -->
		<div class="card-body">
			<!-- ================================================= -->
			<!-- 검색바 시작 -->
			<!-- ================================================= -->
			<div class="input-group mb-3 justify-content-end">
				<select class="form-control col-md-1" name="perPageNum" id="perPageNum" onchange="list_go(1);">					  		  		
			  		<option value="10" ${cri.perPageNum eq 10 ? 'selected' : '' } >정렬개수</option>
			  		<option value="2" ${cri.perPageNum eq 2 ? 'selected' : '' }>2개씩</option>
			  		<option value="3" ${cri.perPageNum eq 3 ? 'selected' : '' }>3개씩</option>
			  		<option value="5" ${cri.perPageNum eq 5 ? 'selected' : '' }>5개씩</option>
			  	</select>
			 	<select class="form-control col-md-1" name="searchType" id="searchType">
			 		<option value=""  >검색구분</option>
					<option value="t" ${param.searchType=='t' ? "selected":"" }>글제목</option>
					<option value="w" ${param.searchType=='w' ? "selected":"" }>작성자</option>
					<option value="c" ${param.searchType=='c' ? "selected":"" }>글내용</option>	
									 									
				</select>
				<!-- keyword -->
			 	<input  class="form-control col-md-2" type="text" name="keyword" placeholder="검색어를 입력하세요." value="${cri.keyword }"/>
				<span class="input-group-append">
					<button class="btn btn-primary btn-sm" type="button" 
							id="searchBtn" onclick="list_go(1);">
						<i class="fa fa-fw fa-search"></i>
					</button>
				</span>
			</div>
			<!-- ================================================= -->
			<!-- 검색바 끝 -->
			<!-- ================================================= -->
		
			<!-- ================================================= -->
			<!-- 게시판 시작 -->
			<!-- ================================================= -->
		
			<table class="table table-hover">
				<thead>
					<tr>
						<th scope="col">글번호</th>
						<th scope="col">제목</th>
						<th scope="col">내용</th>
						<th scope="col">작성자</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td class="table-title">제목입니당 댓글유무에 따라 노션에서 코드 선택해서 수정!</td>
						<td>내용입니당</td>
						<td>작성자입니당</td>
					</tr>
				</tbody>
			</table>

		<!-- ================================================= -->
		<!-- 게시판 끝 -->
		<!-- ================================================= -->
	
		<!-- ================================================= -->
		<!-- 등록 버튼 시작 -->
		<!-- ================================================= -->
		<div class="row justify-content-end mt-2 mr-2">
			<button class="btn btn-outline-primary" type="button"onclick="">과제등록</button>
		</div>
		<!-- ================================================= -->
		<!-- 등록 버튼 끝 -->
		<!-- ================================================= -->
	
		<!-- ================================================= -->
		<!-- 페이지네이션 시작 -->
		<!-- ================================================= -->
		<div class="row justify-content-center">
				<nav aria-label="Page navigation example">
					<ul class="pagination">
						<li class="page-item">
							<a class="page-link" href="#" aria-label="Previous">
								<span aria-hidden="true">«</span>
								<span class="sr-only">Previous</span>
							</a>
						</li>
						<li class="page-item active">
							<a class="page-link" href="#">1</a>
						</li>
						<li class="page-item">
							<a class="page-link" href="#">2</a>
						</li>
						<li class="page-item">
							<a class="page-link" href="#">3</a>
						</li>
						<li class="page-item">
							<a class="page-link" href="#" aria-label="Next">
								<span aria-hidden="true">»</span>
								<span class="sr-only">Next</span>
							</a>
						</li>
					</ul>
				</nav>
		</div>
		<!-- ================================================= -->
		<!-- 페이지네이션 끝 -->
		<!-- ================================================= -->
		
	</div> 
	<!-- ================================================= -->
	<!-- 카드바디 끝 -->
	<!-- ================================================= -->
	
	
	</div>
	<!-- ================================================= -->
	<!-- 카드 끝 -->
	<!-- ================================================= -->
</div>







</div>
</div>
<!-- ================================================= -->
<!-- MAIN-CONTENT 끝 -->
<!-- ================================================= -->