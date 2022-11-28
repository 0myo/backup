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


	
<div class="wrapper">
  <div >
  	 <section class="content-header">
	  	<div class="container-fluid">
	  		<div class="row md-2">
	  			<div class="col-sm-6">
	  				<h1>신고 페이지</h1>  				
	  			</div><hr>
	  		</div>
	  	</div>
  	</section>
    <!-- Main content -->
    <section class="content register-page">       
		<div class="register-box">         
	    	<form role="form" class="form-horizontal"  method="post">
	    		<div class="register-card-header" >
	    			<h2 style="text-align: center;">신고 회원</h2>
	    		</div>
	        	<div class="register-card-body" >
	            	<div class="row"  style="height:200px;">
						<div class="mailbox-attachments clearfix col-md-12" style="text-align: center;">							
							<div id="pictureView" class="manPicture" data-id="${member.memberName}" style="border: 1px solid green; height: 200px; width: 140px; margin: 0 auto;"></div>														
						</div>
					</div><br/>
					<div>
	                  <h3>회원정보<h3>
					</h3>
          
	                <div class="form-group row">
	                  <label for="inputPassword3" class="col-sm-3 control-label text-right">닉네임</label>
	
	                  <div class="col-sm-9">
	                    <input name="pwd" type="text" class="form-control" id="inputPassword3" value="${member.memberName}" readonly>
	                  </div>
	                </div>
	                 <div class="form-group row">
	                  <label for="inputPassword3" class="col-sm-3 control-label text-right">성별</label>
	
	                  <div class="col-sm-9">
	                    <input name="email" type="email" class="form-control" id="inputPassword3" value="${member.memberSex}" readonly>
	                  </div>
	                </div>
	                 <div class="form-group row">
	                  <label for="inputPassword3" class="col-sm-3 control-label text-right">이메일</label>
	                  <div class="col-sm-9">   
	                  	<input name="phone" type="text" class="form-control" id="inputPassword3" value="${member.memberTel}" readonly><br><hr>      
	                  </div>                  
	                </div>               
	              </div>  
		          <div class="card-footer" style="padding:5px 0;" >
		          		<div class="row">
			          		<div class="col-sm-3 text-center">
			          			<button type="button" onclick="CloseWindow2();" id="modifyBtn" class="btn btn-warning ">차 단</button>
			          		
			            		<button type="button" id="listBtn" onclick="CloseWindow();" class="btn btn-primary pull-right">닫 기</button>
			            	</div>
		          	    </div>  	
		          </div>
	      	  </form>
      	  </div>
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
</div>



<script>
window.onload=function(){
	MemberPictureThumb('<%=request.getContextPath()%>');
}
function CloseWindow(){
	window.opener.location.reload(true);
	window.close();
}

function CloseWindow2(){
	window.opener.location.reload(true);
	alert("차단이 완료되었습니다.");
	window.close();
}
</script>


