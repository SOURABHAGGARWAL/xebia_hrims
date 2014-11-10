<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Xebia HRIMS</title>
</head>
<body
	style="padding-top: 40px; padding-bottom: 40px; background-color: #eee;">

	<div class="container">
		<form action="login.do" method="get" role="form"
			style="max-width: 360px; margin: 0px auto;">
			<h2 class="form-signin-heading text-center">Please sign in</h2>
			<input type="userid" class="form-control" placeholder="User ID"
				required="" name="userid" id="userid" autofocus=""> <br /> <input
				type="password" name="password" id="password" class="form-control"
				placeholder="Password" required="">
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me">
					Remember me
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit"
				value="login">Sign in</button>
		</form>
	</div>


</body>
</html>