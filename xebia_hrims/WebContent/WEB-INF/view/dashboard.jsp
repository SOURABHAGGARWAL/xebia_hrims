<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dashboard</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<style type="text/css">
    .bs-example{
    	margin: 20px;
    }
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<div style="float:left;;min-width:50%">
		<div class="bs-example">
		    <div class="panel panel-default">
				<div class="panel-heading">New Joinees</div>
				<div class="panel-body">
					<p>All Great People Join Xebia.</p>
				</div>
				<!-- List group -->
				<div class="list-group">
					<a href="#" class="list-group-item">Pradeep Arya <span class="badge">12-JUNE-2014</span>
					</a>
					<a href="#" class="list-group-item">Rahul Oberoi <span class="badge">12-AUGUST-2014</span>
					</a>
					<a href="#" class="list-group-item">Harsh Jain <span class="badge">12-JULY-2014</span>
					</a>  
					<a href="#" class="list-group-item">Gurinder Singh <span class="badge">12-SEPTEMBER-2014</span>
					</a>
					<a href="#" class="list-group-item">Sourabh Aggarwal <span class="badge">28-OCTOBER-2014</span>
					</a>
					<a href="#" class="list-group-item">Parminder Singh <span class="badge">26-OCTOBER-2014</span>
					</a>
					<a href="#" class="list-group-item">Rajan Singhal <span class="badge">12-OCTOBER-2014</span>
					</a>
				</div>
			</div>
		</div>
	</div>
	<div style="float:left;min-width:50%">
		<div class="bs-example">
		    <div class="panel panel-default">
				<div class="panel-heading">Events</div>
				<div class="panel-body">
					<p>Latest Event Organized in Xebia.</p>
				</div>
				<div class="list-group">
					<a href="#" class="list-group-item">Diwali Celebration<span class="badge">12-JUNE-2014</span>
					</a>
					<a href="#" class="list-group-item">Birthday Celebration<span class="badge">12-AUGUST-2014</span>
					</a>
					<a href="#" class="list-group-item">Organization Day<span class="badge">12-JULY-2014</span>
					</a>  
					<a href="#" class="list-group-item">New Year Party<span class="badge">12-SEPTEMBER-2014</span>
					</a>
					<a href="#" class="list-group-item">Christmas Party<span class="badge">28-OCTOBER-2014</span>
					</a>
					<a href="#" class="list-group-item">Holi Celebration<span class="badge">26-OCTOBER-2014</span>
					</a>
					<a href="#" class="list-group-item">Guru Purav<span class="badge">12-OCTOBER-2014</span>
					</a>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>