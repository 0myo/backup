<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.84.0">
<title>Album example · Bootstrap v5.0</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.0/examples/album/">
	
<script src="http://code.jquery.com/jquery-1.11.0.js"></script>



<!-- Bootstrap core CSS -->
<link
	href="<%=request.getContextPath()%>/resources/bootstrap/assets/dist/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}

.rmf {
	width: 70px;
	text-align: right;
}

a {
	text-decoration: none;
	color: black;
}

#long {
	margin: auto;
}

#grid { 
      display: grid;
      grid-template-columns: 12% 88%;
      grid-template-rows: 100%;
      margin: 5px;
      padding: 0px;
}

</style>


</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
			<div class="container-fluid">
				<a class="navbar-brand"
					href="http://localhost/UandI_Matching_System/home/home/home.html">U & I</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarCollapse"
					aria-controls="navbarCollapse" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarCollapse">
					<ul class="navbar-nav me-auto mb-2 mb-md-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Matching</a></li>
						<li class="nav-item"><a class="nav-link"
							href="http://localhost/UandI_Matching_System/home/home/home.html">About</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="#">Board</a></li>
						<li class="nav-item"><a class="nav-link" href="#"
							aria-disabled="true">Help</a></li>
					</ul>
					<form class="d-flex">
						<input class="form-control me-2" type="search"
							placeholder="Search" aria-label="Search">
						<button class="btn btn-outline-success" type="submit">Search</button>
					</form>
				</div>
			</div>
		</nav>
	</header>

<main>
	<form id="form" name="form">
	<section class="py-5 container"><br>
			<div class="w-100 p-3" style="background-color: lightpink " id="long">
				<div id="grid">
					<center><div class="col-sb-2"   >키</div></center>
						<div class="item"   >
								<input class="form-check-input" type="radio"
									name="heightOption" id="heightOption" value="150">
								<label class="form-check-label" for="inlineRadio1">150이하</label>
							&nbsp;&nbsp;
								<input class="form-check-input" type="radio"
									name="heightOption" id="heightOption" value="160">
								<label class="form-check-label" for="inlineRadio2">~160</label>
							&nbsp;&nbsp;
								<input class="form-check-input" type="radio"
									name="heightOption" id="heightOption" value="170">
								<label class="form-check-label" for="inlineRadio2">~170</label>
							&nbsp;&nbsp;
								<input class="form-check-input" type="radio"
									name="heightOption" id="heightOption" value="180">
								<label class="form-check-label" for="inlineRadio2">~180</label>
							&nbsp;&nbsp;
								<input class="form-check-input" type="radio"
									name="heightOption" id="heightOption" value="190">
								<label class="form-check-label" for="inlineRadio2">~190</label>
							&nbsp;&nbsp;
								<input class="form-check-input" type="radio"
									name="heightOption" id="heightOption" value="200">
								<label class="form-check-label" for="inlineRadio2">190이상</label>

							</div>
						</div>
					<hr>
		<div id="grid">
			<center><div class="col-sb-2"   >체형</div></center>
				<div class="item"   >
					<input class="form-check-input" type="radio"
						name="bodyOption" id="bodyOption" value="듬직한"> <label
						class="form-check-label" for="inlineRadio1">듬직한</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="radio"
						name="bodyOption" id="bodyOption" value="슬림한"> <label
						class="form-check-label" for="inlineRadio2">슬림한</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="radio"
						name="bodyOption" id="bodyOption" value="근육질"> <label
						class="form-check-label" for="inlineRadio2">근육질</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="radio"
						name="bodyOption" id="bodyOption" value="건강한"> <label
						class="form-check-label" for="inlineRadio2">건강한</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="radio"
						name="bodyOption" id="bodyOption" value="평범한"> <label
						class="form-check-label" for="inlineRadio2">평범한</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="radio"
						name="bodyOption" id="bodyOption" value="글래머"> <label
						class="form-check-label" for="inlineRadio2">글래머</label>
				</div>
			</div>
			<hr>
		<div id="grid">
			<center><div class="col-sb-2" >외모</div></center>
				<div class="item"   >
					<input class="form-check-input" type="checkbox"
						name="faceOptions" id="faceOptions" value="귀여운" onclick="count_ckFace(this);"> <label
						class="form-check-label" for="inlineRadio1">보조개</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="faceOptions" id="faceOptions" value="섹시한" onclick="count_ckFace(this);" > <label
						class="form-check-label" for="inlineRadio2">눈웃음</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="faceOptions" id="faceOptions" value="청순한"onclick="count_ckFace(this);" > <label
						class="form-check-label" for="inlineRadio2">고양이상</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="faceOptions" id="faceOptions" value="개성있는"onclick="count_ckFace(this);">
					<label class="form-check-label" for="inlineRadio2">강아지상</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="faceOptions" id="faceOptions" value="여우상" onclick="count_ckFace(this);">
					<label class="form-check-label" for="inlineRadio2">여우상</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="faceOptions" id="faceOptions" value="공룡상" onclick="count_ckFace(this);">
					<label class="form-check-label" for="inlineRadio2">공룡상</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="faceOptions" id="faceOptions" value="하얀피부" onclick="count_ckFace(this);"> <label
						class="form-check-label" for="inlineRadio2">하얀피부</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="faceOptions" id="faceOptions" value="까만피부" onclick="count_ckFace(this);"> <label
						class="form-check-label" for="inlineRadio2">까만피부</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="faceOptions" id="faceOptions" value="평범한" onclick="count_ckFace(this);"> <label
						class="form-check-label" for="inlineRadio2">평범한</label>
				</div>
			</div>
			<hr>
		<div id="grid">
			<center><div class="col-sb-2"   >성격</div></center>
				<div class="item"   >
					<input class="form-check-input" type="checkbox"
						name="charOptions" id="charOptions" value="활동적인" onclick="count_ckChar(this);" >
					<label class="form-check-label" for="inlineRadio1">활동적인</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="charOptions" id="charOptions" value="사교적인" onclick="count_ckChar(this);">
					<label class="form-check-label" for="inlineRadio2">사교적인</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="charOptions" id="charOptions" value="긍정적인" onclick="count_ckChar(this);">
					<label class="form-check-label" for="inlineRadio2">긍정적인</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="charOptions" id="charOptions" value="유쾌한" onclick="count_ckChar(this);"> <label
						class="form-check-label" for="inlineRadio2">유쾌한</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="charOptions" id="charOptions" value="말많은" onclick="count_ckChar(this);"> <label
						class="form-check-label" for="inlineRadio2">말많은</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="charOptions" id="charOptions" value="무난한" onclick="count_ckChar(this);"> <label
						class="form-check-label" for="inlineRadio2">무난한</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="charOptions" id="charOptions" value="차분한" onclick="count_ckChar(this);"> <label
						class="form-check-label" for="inlineRadio2">차분한</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="charOptions" id="charOptions" value="지적인" onclick="count_ckChar(this);"> <label
						class="form-check-label" for="inlineRadio2">지적인</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="charOptions" id="charOptions" value="진지한" onclick="count_ckChar(this);"> <label
						class="form-check-label" for="inlineRadio2">진지한</label>
				</div>
			</div>
			<hr>

		<div id="grid">
			<center><div class="col-sb-2"   >취미</div></center>
				<div class="item"   >
					<input class="form-check-input" type="checkbox"
						name="hobbyOptions" id="hobbyOptions" value="맛집탐방" onclick="count_ckHobby(this);">
					<label class="form-check-label" for="inlineRadio1">맛집탐방</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="hobbyOptions" id="hobbyOptions" value="영화" onclick="count_ckHobby(this);">
					<label class="form-check-label" for="inlineRadio2">영화</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="hobbyOptions" id="hobbyOptions" value="술" onclick="count_ckHobby(this);">
					<label class="form-check-label" for="inlineRadio2">술</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="hobbyOptions" id="hobbyOptions" value="여행" onclick="count_ckHobby(this);">
					<label class="form-check-label" for="inlineRadio2">여행</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="inlineRadioOptions" id="inlineRadioOptions" value="드라이브" onclick="count_ckHobby(this);">
					<label class="form-check-label" for="inlineRadio2">드라이브</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="inlineRadioOptions" id="inlineRadioOptions" value="공연/뮤지컬" onclick="count_ckHobby(this);">
					<label class="form-check-label" for="inlineRadio2">공연/뮤지컬</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="inlineRadioOptions" id="inlineRadioOptions" value="운동" onclick="count_ckHobby(this);">
					<label class="form-check-label" for="inlineRadio2">운동</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="hobbyOptions" id="hobbyOptions" value="독서" onclick="count_ckHobby(this);">
					<label class="form-check-label" for="inlineRadio2">독서</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="hobbyOptions" id="hobbyOptions" value="게임" onclick="count_ckHobby(this);">
					<label class="form-check-label" for="inlineRadio2">게임</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="hobbyOptions" id="hobbyOptions" value="에술" onclick="count_ckHobby(this);">
					<label class="form-check-label" for="inlineRadio2">에술</label>
				&nbsp;&nbsp;
					<input class="form-check-input" type="checkbox"
						name="hobbyOptions" id="hobbyOptions" value="등산" onclick="count_ckHobby(this);">
					<label class="form-check-label" for="inlineRadio2">등산</label>
				</div>
			</div>
			<hr>

		<div id="grid">
			<center><div class="col-sb-2"   >MBTI</div></center>
				<div class="item"  name="mbtiOption" >
					<select style="width:80px;" name="mbtiOption">
						<option name="mbtiOption" value="MBTI">MBTI</option>
						<option name="mbtiOption" value="ENTP">ENTP</option>
						<option name="mbtiOption" value="ESFP">ESFP</option>
						<option name="mbtiOption" value="ENFP">ENFP</option>
						<option name="mbtiOption" value="ESTP">ESTP</option>
						<option name="mbtiOption" value="ESTJ">ESTJ</option>
						<option name="mbtiOption" value="ENTJ">ENTJ</option>
						<option name="mbtiOption" value="ENFJ">ENFJ</option>
						<option name="mbtiOption" value="ESFJ">ESFJ</option>
		
						<option  name="mbtiOption" value="ISTJ">ISTJ</option>
						<option  name="mbtiOption" value="ISTP">ISTP</option>
						<option  name="mbtiOption" value="INFP">INFP</option>
						<option  name="mbtiOption" value="INTP">INTP</option>
						<option  name="mbtiOption" value="ISFJ">ISFJ</option>
						<option  name="mbtiOption" value="ISFP">ISFP</option>
						<option  name="mbtiOption" value="INFJ">INFJ</option>
						<option  name="mbtiOption" value="INTJ">INTJ</option>
					</select>
				</div>
			</div>
		<hr>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<button type="button" id="myButton" data-loading-text="Loading..."
				class="btn btn-primary" autocomplete="off">선택</button>
			<button type="button" id="cleanButton" data-loading-text="Loading..."
				class="btn btn-primary" autocomplete="off">초기화</button>
		</div>
	</section>
	</form>
	
	
	<div class="album py-5 bg-light">
		<div class="container">

			<div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
				<div class="col">
					<div class="card shadow-sm">
						<img src="<%=request.getContextPath()%>/resources/images/han.jpg"
							class="bd-placeholder-img card-img-top" width="100%" height="425"
							xmlns="http://www.w3.org/2000/svg" role="img"
							aria-label="Placeholder: Thumbnail"
							preserveAspectRatio="xMidYMid slice" focusable="false"> <a
							href="">
							<div class="card-body">
								<p class="card-text">안녕하세요 한태훈입니다.</p>
								<button
									href='http://localhost/UandI_Matching_System/UnI/matching/maching2.html'>선택</button>
								<div class="d-flex justify-content-between align-items-center">
								</div>
						</a>
					</div>
				</div>
			</div>
			<div class="col">
				<div class="card shadow-sm">
					<img src="<%=request.getContextPath()%>/resources/images/han.jpg"
						class="bd-placeholder-img card-img-top" width="100%" height="425"
						xmlns="http://www.w3.org/2000/svg" role="img"
						aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"> 
						<a href="">
						<div class="card-body">
							<p class="card-text">안녕하세요 윤재열입니다.</p>
						<div class="d-flex justify-content-between align-items-center">
						</div>
					</a>
				</div>
			</div>
		</div>
		<div class="col">
			<div class="card shadow-sm">
				<img src="<%=request.getContextPath()%>/resources/images/han.jpg"
					class="bd-placeholder-img card-img-top" width="100%" height="425"
					xmlns="http://www.w3.org/2000/svg" role="img"
					aria-label="Placeholder: Thumbnail"
					preserveAspectRatio="xMidYMid slice" focusable="false"> <a
					href="">
					<div class="card-body">
						<p class="card-text">안녕하세요 윤재열입니다.</p>
						<div class="d-flex justify-content-between align-items-center">
						</div>
				</a>
			</div>
		</div>
	</div>

	<div class="col">
		<div class="card shadow-sm">
			<img src="<%=request.getContextPath()%>/resources/images/han.jpg"
				class="bd-placeholder-img card-img-top" width="100%" height="425"
				xmlns="http://www.w3.org/2000/svg" role="img"
				aria-label="Placeholder: Thumbnail"
				preserveAspectRatio="xMidYMid slice" focusable="false"> <a
				href="">
				<div class="card-body">
					<p class="card-text">안녕하세요 윤재열입니다.</p>
					<div class="d-flex justify-content-between align-items-center">
					</div>
			</a>
		</div>
	</div>
	</div>
	<div class="col">
		<div class="card shadow-sm">
			<img src="<%=request.getContextPath()%>/resources/images/han.jpg"
				class="bd-placeholder-img card-img-top" width="100%" height="425"
				xmlns="http://www.w3.org/2000/svg" role="img"
				aria-label="Placeholder: Thumbnail"
				preserveAspectRatio="xMidYMid slice" focusable="false"> <a
				href="">
				<div class="card-body">
					<p class="card-text">안녕하세요 윤재열입니다.</p>
					<div class="d-flex justify-content-between align-items-center">
					</div>
			</a>
		</div>
	</div>
	</div>
	<div class="col">
		<div class="card shadow-sm">
			<img src="<%=request.getContextPath()%>/resources/images/han.jpg"
				class="bd-placeholder-img card-img-top" width="100%" height="425"
				xmlns="http://www.w3.org/2000/svg" role="img"
				aria-label="Placeholder: Thumbnail"
				preserveAspectRatio="xMidYMid slice" focusable="false"> <a
				href="">
				<div class="card-body">
					<p class="card-text">안녕하세요 윤재열입니다.</p>
					<div class="d-flex justify-content-between align-items-center">
					</div>
			</a>
		</div>
	</div>
	</div>

	<div class="col">
		<div class="card shadow-sm">
			<img src="<%=request.getContextPath()%>/resources/images/han.jpg"
				class="bd-placeholder-img card-img-top" width="100%" height="425"
				xmlns="http://www.w3.org/2000/svg" role="img"
				aria-label="Placeholder: Thumbnail"
				preserveAspectRatio="xMidYMid slice" focusable="false"> <a
				href="">
				<div class="card-body">
					<p class="card-text">안녕하세요 윤재열입니다.</p>
					<div class="d-flex justify-content-between align-items-center">
					</div>
			</a>
		</div>
	</div>
	</div>
	<div class="col">
		<div class="card shadow-sm">
			<img src="<%=request.getContextPath()%>/resources/images/han.jpg"
				class="bd-placeholder-img card-img-top" width="100%" height="425"
				xmlns="http://www.w3.org/2000/svg" role="img"
				aria-label="Placeholder: Thumbnail"
				preserveAspectRatio="xMidYMid slice" focusable="false"> <a
				href="">
				<div class="card-body">
					<p class="card-text">안녕하세요 윤재열입니다.</p>
					<div class="d-flex justify-content-between align-items-center">
					</div>
			</a>
		</div>
	</div>
	</div>
	<div class="col">
		<div class="card shadow-sm">
			<img src="<%=request.getContextPath()%>/resources/images/han.jpg"
				class="bd-placeholder-img card-img-top" width="100%" height="425"
				xmlns="http://www.w3.org/2000/svg" role="img"
				aria-label="Placeholder: Thumbnail"
				preserveAspectRatio="xMidYMid slice" focusable="false"> <a
				href="">
				<div class="card-body">
					<p class="card-text">안녕하세요 윤재열입니다.</p>
					<button
						href='http://localhost/UandI_Matching_System/UnI/matching/maching2.html'>선택</button>
					<div class="d-flex justify-content-between align-items-center">
					</div>
			</a>
		</div>
	</div>
</main>

	<footer class="text-muted py-5">
		<div class="container">
			<p class="float-end mb-1">
				<a href="#">Back to top</a>
			</p>
			<p class="mb-1">Album example is &copy; Bootstrap, but please
				download and customize it for yourself!</p>
			<p class="mb-0">
				New to Bootstrap? <a href="/">Visit the homepage</a> or read our <a
					href="../getting-started/introduction/">getting started guide</a>.
			</p>
		</div>
	</footer>
	
 <script>
 $(function() {
   $("#myButton").click(function() {
     var str = $("#form").serialize();
     alert(str);
 	console.log("str",str)
 	
     $.ajax({
       type:"POST",
       url:"matchingHome_W.do",
       contentType: "application/x-www-form-urlencoded; charset=utf-8",
       data: str,
       datatype:"json",
       success: function(str) {
         alert(str.bodyOption.value);			
//          confirm(str "매칭이 시작됩니다.");	
		var list = str;
	
// 		console.log(list)
		for(var i =0; i<list.length; i++){
			var bodyOption = list[i].value;
			var heightOption = list[i].value;
// 			$("#bodyOption").val(data.bodyOption)  ;
// 			$("#heightOption").val(data.heightOption);
			};
			console.log(bodyOption,heightOption)
// 			alert(bodyOption, heightOption);		
       },
       error: function(e) {
         alert("에러발생");
       }			
     });
   });
 });
 </script>
 
 <script>
 	function count_ckFace(obj){
 		var chkbox = document.getElementsByName("faceOptions");
 		var chkCnt = 0;
 		for(var i=0;i< chkbox.length; i++){
 			if(chkbox[i].checked){
 				chkCnt++;
 				}
 			}
 		if(chkCnt>2){
 			alert("2개까지 선택하실 수 있습니다.\n(추가 선택하시려면 선택된 체크를 해제해 주세요.)");
 			obj.checked = false;
 			return false;
 			}
 		}
 	
 	function count_ckChar(obj){
 		var chkbox = document.getElementsByName("charOptions");
 		var chkCnt = 0;
 		for(var i=0;i< chkbox.length; i++){
 			if(chkbox[i].checked){
 				chkCnt++;
 				}
 			}
 		if(chkCnt>2){
 			alert("2개까지 선택하실 수 있습니다.\n(추가 선택하시려면 선택된 체크를 해제해 주세요.)");
 			obj.checked = false;
 			return false;
 			}
 		}
 	
 	function count_ckHobby(obj){
 		var chkbox = document.getElementsByName("hobbyOptions");
 		var chkCnt = 0;
 		for(var i=0;i< chkbox.length; i++){
 			if(chkbox[i].checked){
 				chkCnt++;
 				}
 			}
 		if(chkCnt>2){
 			alert("2개까지 선택하실 수 있습니다.\n(추가 선택하시려면 선택된 체크를 해제해 주세요.)");
 			obj.checked = false;
 			return false;
 			}
 		}
 	
 </script>

	<script src="../assets/dist/js/bootstrap.bundle.min.js"></script>


</body>
</html>