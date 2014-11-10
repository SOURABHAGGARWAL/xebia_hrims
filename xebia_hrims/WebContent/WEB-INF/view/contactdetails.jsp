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
		<form action="contactdetails.do" method="get" role="form"
			style="max-width: 600px; margin: 0px auto;">
			<h2 class="form-signin-heading text-center">Enter your Contact Details</h2>
			<div class="form-horizontal">
				<div class="control-group row-fluid form-inline">
					              <label for="Employee Personal Address" class="control-label"><p class="text-info">Personal Address&nbsp;<i class="icon-star"></i></p>
					              </label>
					   <div class="form-inline">
					       	      <input type="text" id="personal_address1" placeholder="Address 1" class="span2">
					              <input type="text" id="personal_address2" placeholder="Address 2" class="span2"> 
					              <input type="text" id="personal_address3" placeholder="Address 3"   class="span2">
					  </div>
					              <label for="Employee Personal Address Zipcode " class="control-label"><p class="text-info">Pincode&nbsp;<i class="icon-star"></i></p>
					              </label>
					   <div class="form-inline">
					              <input type="text" id="personal_address_pincode"  placeholder="Pincode"   class="span2">
					  </div>
					      		  <label for="Employee Current Adress" class="control-label"><p class="text-info">Current Address&nbsp;<i class="icon-star"></i></p>
					     		  </label>
					   <div class="form-inline">
					              <input type="text" id="current_address1"  placeholder="Address 1"   class="span2">
						 		  <input type="text" id="current_address2"  placeholder="Address 2"   class="span2">
								  <input type="text" id="current_address3"  placeholder="Address 3"   class="span2">
					  </div>
					  
					  <label for="Employee Current Address Zipcode " class="control-label"><p class="text-info">Pincode&nbsp;<i class="icon-star"></i></p>
					     		  </label>
					   <div class="form-inline">
					              <input type="text" id="current_address_pincode"  placeholder="Pincode"   class="span2">
					  </div>
					    		  <label for="Employee Country" class="control-label"><p class="text-info">
								  Employee Country&nbsp;<i class="icon-star"></i> </p></label>
					
					  
					   <div class="form-inline">
					              <input type="text" id="country"  placeholder="country"   class="span2">
					  </div>
					
					        	  <label for="State" class="control-label"><p class="text-info">
							      State&nbsp;<i class="icon-star"></i> </p></label>
					
					  <div class="form-inline">
					              <input type="text" id="state"  placeholder="state"   class="span2">
					  </div>
					 			  <label for="City" class="control-label"><p class="text-info">
								  City&nbsp;<i class="icon-star"></i> </p></label>
					
					  
					   <div class="form-inline">
					              <input type="text" id="city"  placeholder="city"   class="span2">
					  </div>
					  
					  
					      		  <label for="Employee Contact Number" class="control-label"><p class="text-info">Contact Details&nbsp;<i class="icon-star"></i></p>
					     		  </label>
					   <div class="form-inline">
					              <input type="text" id="personal_number"   placeholder="Personal Number"   class="span2">
						 		  <input type="text" id="emergency_number"  placeholder="Emergency Number"   class="span2">
								  <input type="text" id="home_number"       placeholder="Home Town Number"   class="span2">
					  </div>
					  
					  
					      		  <label for="Employee Email id" class="control-label"><p class="text-info">Email id&nbsp;<i class="icon-star"></i></p>
					     		  </label>
					   <div class="form-inline">
					              <input type="text" id="personal_email"   placeholder="Personal Email"   class="span2">
						 		  <input type="text" id="official_email"   placeholder="Official xebia Email"   class="span2">
						 		  <input type="text" id="skype_id"         placeholder="Skype Id"   class="span2">
					   </div>
						
					             <ul class="nav navbar-nav navbar-left">
					              <button type="submit" class="btn" margin="left">Upload Resume</button>
					             </ul>
					             <ul class="nav navbar-nav navbar-right">
					              <button type="submit" class="btn" margin="right">Save</button>
					             </ul> 
				</div>	
			</div>
        </form>
 </div>
</body>
</html>