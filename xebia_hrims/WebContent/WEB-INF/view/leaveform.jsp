<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    body 
    { 
    	font-size: 140%; 
    }
</style>
<script type="text/javascript">
	$(document).ready(function() {
	    $('#employeeLeaveData').dataTable();
	} );
</script>
</head>
	<body>
		<jsp:include page="header.jsp"></jsp:include>
			<div style="margin: 10px 10px 10px 10px;">
				<table id="employeeLeaveData" class="table table-striped table-bordered" cellspacing="0" width="100%">
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
			            <tr>
			                <td>1</td>
			                <td>CL</td>
			                <td>Casual Leave</td>
			                <td>2</td>
			                <th>0</th>
			                <th>Yes</th>
			                <th>Yes</th>
			                <th>0.5</th>
			                <th>0</th>
			                <th>Planned Leave cannot with CL</th>
			                <th></th>
			            </tr>
			            <tr>
			                <td>2</td>
			                <td>PL</td>
			                <td>Planned Leave</td>
			                <td>3.5</td>
			                <th>0</th>
			                <th>Yes</th>
			                <th>Yes</th>
			                <th>0.5</th>
			                <th>0</th>
			                <th>Planned Leave cannot with OL</th>
			                <th></th>
			            </tr>
					</tbody>
				</table>
			</div>
		
			<div style="padding-left: 20px;">
				<form action="login.do" method="get">
					<table>
						<tr>
							<td>
								<label>Type :</label>
							</td>
							<td>
								<select>
									<c:forEach var="listValue" items="${leaves}">
										<option value="${listValue.getType()}">${listValue.getName()}</option>
									</c:forEach>
								</select>
							</td>
						</tr>
						<tr>
							<td>
								<label> Start Date : </label>
							</td>
							<td>
								<div class="input-group" id="startDate">
								    <span class="input-group-addon datepickerbutton">
								        <span class="glyphicon glyphicon-calendar"></span>
								    </span>
								    <input type='text' class="form-control"/>
								    <span class="input-group-addon">
								        <span class="glyphicon glyphicon-remove"></span>
								    </span>
								</div>
							</td>
							<td style="padding-left: 10px;">
							  <label><input type="radio" name="startDateTime">Full day</label>
							  <label><input type="radio" name="startDateTime">FN</label>
							  <label><input type="radio" name="startDateTime">AN</label>
							</td>
						</tr>
						<tr>
							<td>
								<label> End Date : </label>
							</td>
							<td>
								<div class="input-group" id="endDate">
								    <span class="input-group-addon datepickerbutton">
								        <span class="glyphicon glyphicon-calendar"></span>
								    </span>
								    <input type='text' class="form-control"/>
								    <span class="input-group-addon">
								        <span class="glyphicon glyphicon-remove"></span>
								    </span>
								</div>
							</td>
							<td style="padding-left: 10px;">
							  <label><input type="radio" name="endDateTime">Full day</label>
							  <label><input type="radio" name="endDateTime">FN</label>
							  <label><input type="radio" name="endDateTime">AN</label>
							</td>
						</tr>
						<tr>
							<td>
								<label>Reason : </label>
							</td>
							<td>
								<textarea rows="4" cols="50" name="reason" id="reason"></textarea> 
							</td>
						</tr>
						<tr>
							<td>
								<label>Handover To : </label>
							</td>
							<td>
								<input type="text" name="handover" id="handover"> 
							</td>
						</tr>
						<tr>
							<td>
								<label>Employee To Notify : <label>
							</td>
							<td>
								<input type="text" name="notify" id="handover"> 
							</td>
						</tr>
						<tr>
							<td>
								<input type="submit" class="btn btn-primary" value="Submit">
							</td>
						</tr>
					</table>
				</form>
			</div>
		<jsp:include page="footer.jsp"></jsp:include>
	</body>
</html>