<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dashboard</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<style type="text/css">
.bs-example {
	margin: 20px;
}

body {
	font-size: 140%;
}
</style>
<script type="text/javascript">
	$(document).ready(function() {
		$('#employeeLeaveData').dataTable();
	});
</script>
</head>
<body>
		<jsp:include page="../global/header.jsp"></jsp:include>
		<div style="margin: 10px 10px 10px 10px;">
	
	<td><label> Leave Name :</label></td>
						<td><select name="leaveType" id="leaveType">
								
						</select></td>
	
	<table border="2">
		<c:forEach var="listValue" items="${leaveinfo}">
			<tr>
				<td>${listValue.getLeaveType()}</td>
				<td>${listValue.getStartDate()}</td>
				<td>${listValue.getEndDate()}</td>
				<td>${listValue.getHrStatus()}</td>
				<td>${listValue.getManagerStatus()}</td>
			</tr>
		</c:forEach>
	</table>
		</div>
	<jsp:include page="../global/footer.jsp"></jsp:include>
</body>
</html>