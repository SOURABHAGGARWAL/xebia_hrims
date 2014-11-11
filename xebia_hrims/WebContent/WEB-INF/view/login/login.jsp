<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="/xebia_hrims/js/bootstrap/bootstrap.min.js"></script>
<link rel="stylesheet" href="/xebia_hrims/css/bootstrap/bootstrap.min.css">
<script src="/xebia_hrims/js/jquery/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Xebia HRIMS</title>
</head>
<body style="background-color: white;">

	<div class="container" align="center" style="margin-top: 12%">
		<div style="vertical-align: top; margin: 10px 10px 10px 10px;">
			<img width="200px;" height="50px;" src="/xebia_hrims/images/logo_xebia.jpg">
		</div>
		<form action="login.do" method="get" role="form" style="max-width: 360px; margin: 0px auto;">
			<input type="userid" class="form-control" placeholder="Employee ID" required="" name="userid" id="userid" autofocus=""> 
			<br>
			<input type="password" name="password" id="password" class="form-control" placeholder="Password" required="">
			<div class="checkbox" style="float: left;">
				<label> <input type="checkbox" value="remember-me">Remember me</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit" value="login">Sign in</button>
		</form>
		<div style="color: red;">${errormessage}</div>
	</div>


</body>
</html>