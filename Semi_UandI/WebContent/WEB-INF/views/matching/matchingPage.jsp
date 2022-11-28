<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.84.0">
    <title>Jumbotron example · Bootstrap v5.0</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/jumbotron/">

    

    <!-- Bootstrap core CSS -->
<link href="<%=request.getContextPath() %>/resources/bootstrap/assets/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
	<script>
		function hiddenOff(matchingBTN) {
	    	document.getElementById( 'click1' ).setAttribute( 'type', 'text' );
	    	document.getElementById( 'click2' ).setAttribute( 'type', 'text' );
	    	document.getElementById( 'click3' ).setAttribute( 'type', 'text' );
		}

		function OpenWindow(UrlStr, WinTitle, WinWidth, WinHeight) {
			winleft = (screen.width - WinWidth) / 2;
			wintop = (screen.height - WinHeight) / 2;
			var win = window.open(UrlStr , WinTitle , "scrollbars=yes,width="+ WinWidth +", " 
									+"height="+ WinHeight +", top="+ wintop +", left=" 
									+ winleft +", resizable=yes, status=yes"  );
			win.focus() ; 
		}   
		</script>

    
  </head>
  <body>
    
<main>
  <div class="container py-4">
    <header>
  <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
    <div class="container-fluid">
      <a class="navbar-brand" href="http://localhost/UandI_Matching_System/home/home/home.html">U & I</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav me-auto mb-2 mb-md-0">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#">Matching</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="http://localhost/UandI_Matching_System/home/home/home.html">About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Board</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#" aria-disabled="true">Help</a>
          </li>
        </ul>
        <form class="d-flex">
          <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success" type="submit">Search</button>
        </form>
      </div>
    </div>
  </nav>
</header>
<hr><br>
<div><br></div><br>
    <div class="row align-items-md-stretch">
      <div class="col-md-7">
        <div class="h-100 p-5 text-white bg-dark rounded-3">
        <img src="<%=request.getContextPath() %>/resources/images/han.jpg" width="650" height="650" class="bd-placeholder-img" alt="...">
             <!--이름 -->
             <input style="border:none;  background:none; color: white; font-size:xxx-large; font-style: normal;"
                name="nick" type="text" class="form-control" id="nick"  value="${member.memberName}" readonly>
          <!--해시태그 -->
             <input style="border:none; background:none; color: white; font-size:large; font-style: normal;" 
             name="nick" type="text" class="form-control" id="nick"  value="${member.memberBirth}" readonly>
          <br> &nbsp;&nbsp;
          	<input id="matchingBTN" class="btn btn-outline-light" type="button" onclick="hiddenOff()" value="매칭하기"></input>
        </div>
      </div>
      <div class="col-md-5">
        <div class="h-100 p-5 bg-light border rounded-3">
          <br>
          <h1>Matching</h1>
          
          <hr><br>
          <h2>info</h2>
             <ul>
            <div>
                <li>
                   <input style="border:none; background:none;" name="nick" type="text" 
                      class="form-control" id="nick"  value="${member.memberName}" readonly>
                </li>
                <li>
                   <input style="border:none; background:none;" name="nick" type="text" 
                      class="form-control" id="nick"  value="${member.memberBirth}" readonly>
                </li>
                <li>
                 <input style="border:none; background:none;" name="nick" type="text" 
                      class="form-control" id="nick"  value="${member.memberAddr}" readonly>
                </li>
                <li>
                   <input style="border:none; background:none;" name="nick" type="text" 
                      class="form-control" id="nick"  value="${member.myMbti}" readonly>
                </li>
                <li>
                   <input style="border:none; background:none;" name="nick" type="text" 
                      class="form-control" id="nick"  value="${member.myHobby}" readonly>
                </li>
                <li>
                   <input style="border:none; background:none;" name="nick" type="text" 
                      class="form-control" id="nick"  value="${member.myBody}" readonly>
                </li>
                <li>
                   <input style="border:none; background:none;" name="nick" type="text" 
                      class="form-control" id="nick"  value="${member.myFace}" readonly>
                </li>
                <li>
                   <input style="border:none; background:none;" name="nick" type="text" 
                      class="form-control" id="nick"  value="${member.myCharacter}" readonly>
                </li>
                <li>
                   <input style="border:none; background:none;" name="nick" type="text" 
                      class="form-control" id="nick"  value="${member.memberSex}" readonly>
                </li>
                <li>
                   <input style="border:none; background:none;" name="nick" type="text" 
                      class="form-control" id="nick"  value="${member.myHeight}" readonly>
                </li>
              </div>
             </ul>
       <hr><br>
       
    	<h2>more info</h2>
        	<ul>
                <li >
                   <input style="border:none; background:none;" name="nick" type="hidden" 
                      class="form-control" id="click1"  value="${member.memberName}" readonly>
                </li>
                <li>
                   <input style="border:none; background:none;" name="nick" type="hidden" 
                      class="form-control" id="click2"  value="${member.memberBirth}" readonly>
                </li>
                <li>
                   <input style="border:none; background:none;" name="nick" type="hidden" 
                      class="form-control" id="click3"  value="${member.memberTel}" readonly>
                </li>
        	</ul><br>
       <hr><br>
          <button href='http://localhost/Semi_UandI/matching/matchingReport.html' class="btn btn-outline-secondary" 
          type="button" onclick="OpenWindow('matchingReport.do','회원등록',600,700);">신고</button>
        </div>
      </div>
    </div>

    <footer class="pt-3 mt-4 text-muted border-top">
      &copy; 2021
    </footer>
  </div>
</main>


    
  </body>
</html>