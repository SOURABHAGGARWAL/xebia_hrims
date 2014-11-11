<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>cancel leave</title>
<script src="/xebia_hrims/js/bootstrap/bootstrap.min.js"></script>
<link rel="stylesheet" href="/xebia_hrims/css/bootstrap/bootstrap.min.css">
<script src="/xebia_hrims/js/jquery/jquery.min.js"></script>
<link rel="stylesheet" href="/xebia_hrims/css/bootstrap/bootstrap-theme.min.css">
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