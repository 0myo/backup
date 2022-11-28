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

<!-- Bootstrap core CSS -->
<link href="<%=request.getContextPath() %>/resources/bootstrap/assets/dist/css/bootstrap.min.css" rel="stylesheet" >

</head>
<body>

<main style="height: 100%">
   <div class="album py-5 bg-light">
      <div class="container">


         <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
            <div class="col">
               <div class="card shadow-sm">
                  <img src="<%=request.getContextPath() %>/resources/images/han.jpg" class="bd-placeholder-img card-img-top"
                     width="100%" height="400" xmlns="http://www.w3.org/2000/svg"
                     role="img" aria-label="Placeholder: Thumbnail"
                     preserveAspectRatio="xMidYMid slice" focusable="false">
                  <a href="http://localhost/Semi_UandI/matching/matchingPage.do">
                     <div class="card-body">
                        <p class="card-text">안녕하세요 한태훈입니다.</p>
                        
                        <input name="name" type="text" class="form-control" id="name" value="${member.name}">
							
                           <button href='http://localhost/Semi_UandI/matching/matchingPage.do'>선택</button>
                        <div class="d-flex justify-content-between align-items-center">
                        </div>
                  </a>
               </div>
            </div>
         </div>
         
         
   </main> 

   <script src="../assets/dist/js/bootstrap.bundle.min.js"></script>
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

</body>
</html>