<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dashboard</title>
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
		<table id="employeeLeaveData"
			class="table table-striped table-bordered" cellspacing="0"
			width="100%">
			<thead>
				<tr>
					<th>#</th>
					<th>Type</th>
					<th>Name</th>
					<th>Balance</th>
					<th>PP Balance</th>
					<th>-Ve Allowed</th>
					<th>Half Day</th>
					<th>Minimum Days/Hours</th>
					<th>Maximum Days/Hours</th>
					<th>Leave Not To Club With</th>
					<th>Valid Till</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="listValue" items="${leaves}">
					<c:set var="leave" value="${fn:split(listValue, ',')}" />
					<!-- ToDo Handle IndexOutOfBoundException -->
					<tr>
						<td>${leave[0]}</td>
						<td>${leave[1]}</td>
						<td>${leave[2]}</td>
						<td>${leave[3]}</td>
						<th>0</th>
						<th>Yes</th>
						<th>Yes</th>
						<th>0.5</th>
						<th>0</th>
						<th>Planned Leave cannot with CL</th>
						<th></th>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<div style="padding-left: 20px;">
		<form action="applyLeave.do" method="get">
			<table>
				<tr>
					<td><label>Type :</label></td>
					<td><select name="leaveType" id="leaveType">
							<c:forEach var="listValue" items="${leaves}">
								<c:set var="leave" value="${fn:split(listValue, ',')}" />
								<option value="${leave[0]}">${leave[2]}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td><label> Start Date : </label></td>
					<td>
						<div class="input-group">
							<span class="input-group-addon datepickerbutton"> <span
								class="glyphicon glyphicon-calendar"></span>
							</span> <input type='text' class="form-control" id="startDate"
								name="startDate" /> <span class="input-group-addon"> <span
								class="glyphicon glyphicon-remove"></span>
							</span>
						</div>
					</td>
					<td style="padding-left: 10px;"><label><input
							type="radio" name="startDateTime" value="fullday"
							checked="checked">Full day</label> <label><input
							type="radio" name="startDateTime" value="firsthalf">FN</label> <label><input
							type="radio" name="startDateTime" value="secondhalf">AN</label></td>
				</tr>
				<tr>
					<td><label> End Date : </label></td>
					<td>
						<div class="input-group">
							<span class="input-group-addon datepickerbutton"> <span
								class="glyphicon glyphicon-calendar"></span>
							</span> <input type='text' class="form-control" id="endDate"
								name="endDate" /> <span class="input-group-addon"> <span
								class="glyphicon glyphicon-remove"></span>
							</span>
						</div>
					</td>
					<td style="padding-left: 10px;"><label><input
							type="radio" name="endDateTime" value="fullday" checked="checked">Full
							day</label> <label><input type="radio" name="endDateTime"
							value="firsthalf">FN</label> <label><input type="radio"
							name="endDateTime" value="secondhalf">AN</label></td>
				</tr>
				<tr>
					<td><label>Reason : </label></td>
					<td><textarea rows="4" cols="50" name="reason" id="reason"
							placeholder="Enter Reason"></textarea></td>
				</tr>
				<tr>
					<td><label>Handover To : </label></td>
					<td><input type="text" name="handover" id="handover"
						placeholder="Employee Name"></td>
				</tr>
				<tr>
					<td><label>Employee To Notify : <label></td>
					<td><input type="text" name="notify" id="notify"
						placeholder="Employee Name"></td>
				</tr>
				<tr>
					<td><input type="submit" class="btn btn-primary"
						value="Submit"></td>
				</tr>
			</table>
		</form>
	</div>
	<jsp:include page="../global/footer.jsp"></jsp:include>
</body>
</html>