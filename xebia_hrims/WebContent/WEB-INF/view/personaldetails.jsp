<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert Your Details Here</title>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body 	
	style="padding-top: 40px; padding-bottom: 40px; background-color: #eee;">

<div class="container">
		<form action="personaldetails.do" method="get" role="form"
			style="max-width: 600px; margin: 0px auto;">
			<h2 class="form-signin-heading text-center">Enter your Details</h2>
			<div class="form-horizontal">
				<div class="control-group row-fluid form-inline">
					     <label for="Employee Name" class="control-label"><p class="text-info">Employee Name&nbsp;<i class="icon-star"></i></p>
					     </label>
					   <div class="form-inline">
					       	      <input type="text" id="fname" placeholder="Enter your first name" class="span2">
					              <input type="text" id="mname" placeholder="Enter your middle name" class="span2"> 
					              <input type="text" id="lname" placeholder="Enter your last name"   class="span2">
					  </div>
					      <label for="Employee Date Of Birth" class="control-label"><p class="text-info">Date Of Birth&nbsp;<i class="icon-star"></i></p>
					     </label>
					   <div class="form-inline">
					              <input type="text" id="date"  placeholder="dd"  style="width:40px" class="span2">
						 		  <input type="text" id="month" placeholder="mm" style="width:40px" class="span2">
								  <input type="text" id="year"  placeholder="yy"  style="width:60px" class="span2">
					  </div>
					  
					  
					   <label for="Employee Gender" class="control-label"><p class="text-info">
							Select your Gender&nbsp;<i class="icon-star"></i> </p></label>
							
					<div class="form-inline">
							<label
								class="radio-inline">
								    <input type="radio"
								    name="inlineRadioOptions" id="male" value="option1">
								Male
							</label>
							 <label class="radio-inline"> <input type="radio" name="inlineRadioOptions" id="female" value="option2">Female
							</label>
					</div>
					
					        <label for="Employee Place Of Birth" class="control-label"><p class="text-info">
							Place Of Birth&nbsp;<i class="icon-star"></i> </p></label>
					
					   <div class="form-inline">
					              <input type="text" id="place_of_birth"  placeholder="birth place"   class="span2">
					  </div>
					  <label for="Employee Blood Group" class="control-label"><p class="text-info">
							Blood Group&nbsp;<i class="icon-star"></i> </p></label>
					
					  
					   <div class="form-inline">
					              <input type="text" id="blood_group"  placeholder="blood group"   class="span2">
					  </div>
					  
					    <label for="Employee Country" class="control-label"><p class="text-info">
							Employee Country&nbsp;<i class="icon-star"></i> </p></label>
					
					  
					   <div class="form-inline">
					              <input type="text" id="country"  placeholder="country"   class="span2">
					  </div>
					            <a href="contactdetails.do" style="font-size: 30px; text-decoration: none; float:right;" >Next Page</a> 
				</div>	
			</div>
        </form>
 </div>
 </body>
</html>