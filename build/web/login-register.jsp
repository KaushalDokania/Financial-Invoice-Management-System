<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
	<head>
		<title>Cool Login Form Responsive Widget Template :: w3layouts</title>
		
		<link href="css/login-register.css" rel='stylesheet' type='text/css' />
		
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="Cool Login Form Tab Form,Login Forms,Sign up Forms,Registration Forms,News letter Forms,Elements"./>
		
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		</script>
		<script src="js/jquery.min.js"></script>
		<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
						<script type="text/javascript">
							$(document).ready(function () {
								$('#horizontalTab').easyResponsiveTabs({
									type: 'default', //Types: default, vertical, accordion           
									width: 'auto', //auto or any width like 600px
									fit: true   // 100% fit in a container
								});
							});
		</script>
		
		<link href='//fonts.googleapis.com/css?family=Quicksand:400,300,700' rel='stylesheet' type='text/css'>
	</head>
<body
    <%
        
        //out.println(session.getAttribute("pid"));
        if(session.getAttribute("pid")!=null)
            response.sendRedirect("welcome.jsp");
    %>
<div class="wrap">
	<h1> Cool Login Form </h1>			
	<div class="main-content">
		<div class="sap_tabs">	
			 
			<div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
			 
				  <ul>
					  <li class="resp-tab-item" aria-controls="tab_item-0" role="tab"><span>Login</span></li>
					  <li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><span>create account</span></li>
					  
				  </ul>		
				  <!------ Login Form --------->

				<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
						<div class="register" id="register">
							<form method="POST" action="Login">										
								<input placeholder="Email or ID" class="mail" type="text" name="id" required="">									
								<input placeholder="Password" class="lock" type="password" name="pwd"required="">				
								<input type="submit" value="Login"/>
							</form>
							<p>Forgot Your ID or Password?<a href="forgot_password.html"> Click here</a></p>
						</div>
				</div>	
                                <!----------Registration form------------>
                                
				<div class="tab-2 resp-tab-content" aria-labelledby="tab_item-1">
						<div class="register">
							<form method="POST" action="Registration">	
								<input placeholder="Name" type="text" name="name" required="">
								<input placeholder="Email Address" type="text" name="email" required="">									
								<input placeholder="Password" type="password" name="pwd" required="">	
								<input placeholder="Confirm Password" type="password" required="">
								<textarea name="add" rows="4" cols="50" placeholder="Address"></textarea>
                                                                <input type="date" name="dob"/>
								<input type="text" name="ph" value="+91">
								<select name="sq">
									<option value="null">----Security Question-----</option>
									<option value="pet_name">Pet Name</option>
									<option value="Birthday">Birthday</option>
								</select>
								<input type="text" name="sqans" placeholder="Security Answer">
												<div class="sign-up">
										<input type="submit" value="Create Account"/>
									</div>
							</form>
						</div>
					</div> 	        					            	      
					
			</div>	
			
		</div>
	</div>
 </div>
</body>
</html
