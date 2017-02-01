<%@page import="java.sql.*" %>
<html>
<head>
<title>Admin All Invoices</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Augment Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- Graph CSS -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- jQuery -->
<link href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400' rel='stylesheet' type='text/css'>
<!-- lined-icons -->
<link rel="stylesheet" href="css/icon-font.min.css" type='text/css' />


<!-- //lined-icons -->
<script src="js/jquery-1.10.2.min.js"></script>
<script src="js/amcharts.js"></script>	
<script src="js/serial.js"></script>	
<script src="js/light.js"></script>	
<script src="js/radar.js"></script>	


<link href="css/barChart.css" rel='stylesheet' type='text/css' />
<link href="css/fabochart.css" rel='stylesheet' type='text/css' />

<link href="css/new_invoice.css" rel="stylesheet"> 
<!--clock init-->
<script src="js/css3clock.js"></script>
<!--Easy Pie Chart-->
<!--skycons-icons-->
<script src="js/skycons.js"></script>

<script src="js/jquery.easydropdown.js"></script>

<!--//skycons-icons-->
</head> 
<body>
   <div class="page-container">
   <!--/content-inner-->
	<div class="left-content">
	   <div class="inner-content">
		<!-- header-starts -->
			<div class="header-section">
						<!--menu-right-->
						<div class="top_menu">
						        <div class="main-search">
											<form>
											   <input type="text" value="Search" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Search';}" class="text"/>
												<input type="submit" value="">
											</form>
									<div class="close"><img src="images/cross.png" /></div>
								</div>
									<div class="srch"><button></button></div>
									<script type="text/javascript">
										 $('.main-search').hide();
										$('button').click(function (){
											$('.main-search').show();
											$('.main-search text').focus();
										}
										);
										$('.close').click(function(){
											$('.main-search').hide();
										});
									</script>
							<!--/profile_details-->
								<div class="profile_details_left">
									<ul class="nofitications-dropdown">
											<li class="dropdown note dra-down">
													   <div id="dd" class="wrapper-dropdown-3" tabindex="1">
																			<span>Italy</span>
																			<ul class="dropdown">
																				<li><a class="deutsch">France</a></li>
																				<li><a class="english"> Italy</a></li>
																				<li><a class="espana">Brazil</a></li>
																				<li><a class="russian">Usa</a></li>

																			</ul>
																		</div>
																		<script type="text/javascript">
			
																	function DropDown(el) {
																		this.dd = el;
																		this.placeholder = this.dd.children('span');
																		this.opts = this.dd.find('ul.dropdown > li');
																		this.val = '';
																		this.index = -1;
																		this.initEvents();
																	}
																	DropDown.prototype = {
																		initEvents : function() {
																			var obj = this;

																			obj.dd.on('click', function(event){
																				$(this).toggleClass('active');
																				return false;
																			});

																			obj.opts.on('click',function(){
																				var opt = $(this);
																				obj.val = opt.text();
																				obj.index = opt.index();
																				obj.placeholder.text(obj.val);
																			});
																		},
																		getValue : function() {
																			return this.val;
																		},
																		getIndex : function() {
																			return this.index;
																		}
																	}

																	$(function() {

																		var dd = new DropDown( $('#dd') );

																		$(document).click(function() {
																			// all dropdowns
																			$('.wrapper-dropdown-3').removeClass('active');
																		});

																	});

																</script>
										    </li>
									       <li class="dropdown note">
											<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-envelope-o"></i> <span class="badge">3</span></a>

												
													<ul class="dropdown-menu two first">
														<li>
															<div class="notification_header">
																<h3>You have 3 new messages  </h3> 
															</div>
														</li>
														<li><a href="#">
														   <div class="user_img"><img src="images/1.jpg" alt=""></div>
														   <div class="notification_desc">
															<p>Lorem ipsum dolor sit amet</p>
															<p><span>1 hour ago</span></p>
															</div>
														   <div class="clearfix"></div>	
														 </a></li>
														 <li class="odd"><a href="#">
															<div class="user_img"><img src="images/in.jpg" alt=""></div>
														   <div class="notification_desc">
															<p>Lorem ipsum dolor sit amet </p>
															<p><span>1 hour ago</span></p>
															</div>
														  <div class="clearfix"></div>	
														 </a></li>
														<li><a href="#">
														   <div class="user_img"><img src="images/in1.jpg" alt=""></div>
														   <div class="notification_desc">
															<p>Lorem ipsum dolor sit amet </p>
															<p><span>1 hour ago</span></p>
															</div>
														   <div class="clearfix"></div>	
														</a></li>
														<li>
															<div class="notification_bottom">
																<a href="#">See all messages</a>
															</div> 
														</li>
													</ul>
										</li>
										
							<li class="dropdown note">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-bell-o"></i> <span class="badge">5</span></a>

									<ul class="dropdown-menu two">
										<li>
											<div class="notification_header">
												<h3>You have 5 new notification</h3>
											</div>
										</li>
										<li><a href="#">
											<div class="user_img"><img src="images/in.jpg" alt=""></div>
										   <div class="notification_desc">
											<p>Lorem ipsum dolor sit amet</p>
											<p><span>1 hour ago</span></p>
											</div>
										  <div class="clearfix"></div>	
										 </a></li>
										 <li class="odd"><a href="#">
											<div class="user_img"><img src="images/in5.jpg" alt=""></div>
										   <div class="notification_desc">
											<p>Lorem ipsum dolor sit amet </p>
											<p><span>1 hour ago</span></p>
											</div>
										   <div class="clearfix"></div>	
										 </a></li>
										 <li><a href="#">
											<div class="user_img"><img src="images/in8.jpg" alt=""></div>
										   <div class="notification_desc">
											<p>Lorem ipsum dolor sit amet </p>
											<p><span>1 hour ago</span></p>
											</div>
										   <div class="clearfix"></div>	
										 </a></li>
										 <li>
											<div class="notification_bottom">
												<a href="#">See all notification</a>
											</div> 
										</li>
									</ul>
							</li>	
						<li class="dropdown note">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-tasks"></i> <span class="badge blue1">9</span></a>
										<ul class="dropdown-menu two">
										<li>
											<div class="notification_header">
												<h3>You have 9 pending task</h3>
											</div>
										</li>
										<li><a href="#">
												<div class="task-info">
												<span class="task-desc">Database update</span><span class="percentage">40%</span>
												<div class="clearfix"></div>	
											   </div>
												<div class="progress progress-striped active">
												 <div class="bar yellow" style="width:40%;"></div>
											</div>
										</a></li>
										<li><a href="#">
											<div class="task-info">
												<span class="task-desc">Dashboard done</span><span class="percentage">90%</span>
											   <div class="clearfix"></div>	
											</div>
										   
											<div class="progress progress-striped active">
												 <div class="bar green" style="width:90%;"></div>
											</div>
										</a></li>
										<li><a href="#">
											<div class="task-info">
												<span class="task-desc">Mobile App</span><span class="percentage">33%</span>
												<div class="clearfix"></div>	
											</div>
										   <div class="progress progress-striped active">
												 <div class="bar red" style="width: 33%;"></div>
											</div>
										</a></li>
										<li><a href="#">
											<div class="task-info">
												<span class="task-desc">Issues fixed</span><span class="percentage">80%</span>
											   <div class="clearfix"></div>	
											</div>
											<div class="progress progress-striped active">
												 <div class="bar  blue" style="width: 80%;"></div>
											</div>
										</a></li>
										<li>
											<div class="notification_bottom">
												<a href="#">See all pending task</a>
											</div> 
										</li>
									</ul>
							</li>		   							   		
							<div class="clearfix"></div>	
								</ul>
							</div>
							<div class="clearfix"></div>	
							<!--//profile_details-->
						</div>
						<!--//menu-right-->
					<div class="clearfix"></div>
				</div>
					<!-- //header-ends -->
						<div class="outter-wp">
								<!--custom-widgets-->
                                                                                                <br/>
                                                                                               
                                                                                                <div>
                                                                                                    
                                                                                                    <table border="2" width="800" cellspacing="0" cellpadding="8">
                                                                                                        <tr>
                                                                                                            <th>S.No.</th>
                                                                                                            <th>Invoice No.</th>
                                                                                                            <th>Date</th>
                                                                                                            <th>Customer Name</th>
                                                                                                            <th>Amount</th>
                                                                                                            <th>Paid</th>
                                                                                                            <th>Partner ID</th>
                                                                                                            <th>Partner Name</th>
                                                                                                        </tr>
                                                                                                         <%
                                                                                                            String inv_no="",inv_dt="",cname="",paid="",p="";
                                                                                                            float amount=0;
                                                                                                            int count = 0;
                                                                                                            ResultSet rs;
                                                                                                            
                                                                                                            String type = request.getParameter("type");
                                                                                                            String pid = (String)session.getAttribute("pid");
                                                                                                            out.println(pid);
                                                                                                            out.println("Welcome Admin");
                                                                                                            try
                                                                                                            {
                                                                                                                Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
                                                                                                                //connection with the child databasae(kd,password) by giving fulll path to the database
                                                                                                                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","fin_inv_system","password");//Connection is an interface
                                                                                                                Statement stmt = con.createStatement();//creating a statement reference required to execute a query
                                                                                                                Statement stmt2 = con.createStatement();
                                                                                                                String q1="";
                                                                                                                
                                                                                                                if(type.equals("all"))
                                                                                                                    q1 = "select * from invoice";
                                                                                                                
                                                                                                                rs = stmt.executeQuery(q1);//if query runs sucessfully it gives a +ve value

                                                                                                                while(rs.next() )   //both query runs
                                                                                                                {
                                                                                                                    count++;
                                                                                                                    inv_no = rs.getString("invoice_no");
                                                                                                                    inv_dt = rs.getString("invoice_date");
                                                                                                                    cname = rs.getString("customer_name");
                                                                                                                    amount = Float.parseFloat(rs.getString("amount"));
                                                                                                                    paid = rs.getString("paid");
                                                                                                                    p = rs.getString("pid");
                                                                                                                    String q = "select name from partners where id='"+p+"'";
                                                                                                                    ResultSet rs2 = stmt2.executeQuery(q);
                                                                                                                    if(rs2.next())
                                                                                                                    {
                                                                                                                        String name = rs2.getString(1);
                                                                                                                        if(paid==null || paid.equals(""))
                                                                                                                            paid = "NO";
                                                                                                                        out.print("<tr>"
                                                                                                                                    +"<td>"+count+"</td>"
                                                                                                                                    +"<td>"+inv_no+"</td>"
                                                                                                                                    +"<td>"+inv_dt+"</td>"
                                                                                                                                    +"<td>"+cname+"</td>"
                                                                                                                                    +"<td>"+amount+"</td>"
                                                                                                                                    +"<td>"+paid+"</td>"
                                                                                                                                    +"<td>"+p+"</td>"
                                                                                                                                    +"<td>"+name+"</td>"
                                                                                                                                + "</tr>");
                                                                                                                    }
                                                                                                                    else
                                                                                                                    {
                                                                                                                        out.println("Unsuccessful");
                                                                                                                    }
                                                                                                                    
                                                                                                                }

                                                                                                                con.close();
                                                                                                            }
                                                                                                            catch(Exception e)
                                                                                                            {
                                                                                                                out.println(e);
                                                                                                              }
                                                                                                        %>
                                                                                                       
                                                                                                    </table>
                                                                                                </div>
										<!--//outer-wp-->
									</div>
									 <!--footer section start-->
										<footer>
										   <p>&copy 2016 Augment . All Rights Reserved | Design by <a href="https://w3layouts.com/" target="_blank">W3layouts.</a></p>
										</footer>
									<!--footer section end-->
								</div>
							</div>
				<!--//content-inner-->
			<!--/sidebar-menu-->
				<div class="sidebar-menu">
					<header class="logo">
					<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> <a href="index.html"> <span id="logo"> <h1>Augment</h1></span> 
					<!--<img id="logo" src="" alt="Logo"/>--> 
				  </a> 
				</header>
			<div style="border-top:1px solid rgba(69, 74, 84, 0.7)"></div>
			<!--/down-->
							<div class="down">	
									  <a href="index.html"><img src="images/admin.jpg"></a>
									  <a href="index.html"><span class=" name-caret">Jasmin Leo</span></a>
									 <p>System Administrator in Company</p>
									<ul>
									<li><a class="tooltips" href="index.html"><span>Profile</span><i class="lnr lnr-user"></i></a></li>
										<li><a class="tooltips" href="index.html"><span>Settings</span><i class="lnr lnr-cog"></i></a></li>
										<li><a class="tooltips" href="index.html"><span>Log out</span><i class="lnr lnr-power-switch"></i></a></li>
										</ul>
									</div>
							   <!--//down-->
                           <div class="menu">
									<ul id="menu" >
										<li><a href="admin.jsp"><i class="fa fa-tachometer"></i> <span>Dashboard</span></a></li>
										 <li id="menu-academico" ><a href="admin_partners.jsp?type=all"><i class="fa fa-file-text-o"></i> <span>All Partners</span> </a></li>
										 <li id="menu-academico" ><a href="admin_all_invoices.jsp?type=all"><i class="fa fa-table"></i> <span>All Invoices</span> </a></li>
                                                                                 <li id="menu-academico" ><a href="admin_all_items.jsp?type=all"><i class="fa fa-table"></i> <span>All Items</span> </a></li>
                                                                                 <li id="menu-academico" ><a href="admin_dues.jsp?type=all"><i class="fa fa-table"></i> <span>Dues</span> </a></li>
                                                                                <li><a href="admin_payments.jsp?type=all"><i class="lnr lnr-pencil"></i> <span>Payments</span></a></li>
                                                                                <li id="menu-academico" ><a href="#"><i class="lnr lnr-book"></i> <span>Update Profile</span></a</li>
									 
								  </ul>
								</div>
							  </div>
							  <div class="clearfix"></div>		
							</div>
							<script>
							var toggle = true;
										
							$(".sidebar-icon").click(function() {                
							  if (toggle)
							  {
								$(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
								$("#menu span").css({"position":"absolute"});
							  }
							  else
							  {
								$(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
								setTimeout(function() {
								  $("#menu span").css({"position":"relative"});
								}, 400);
							  }
											
											toggle = !toggle;
										});
							</script>
<!--js -->
<link rel="stylesheet" href="css/vroom.css">
<script type="text/javascript" src="js/vroom.js"></script>
<script type="text/javascript" src="js/TweenLite.min.js"></script>
<script type="text/javascript" src="js/CSSPlugin.min.js"></script>
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>

<!-- Bootstrap Core JavaScript -->
   <script src="js/bootstrap.min.js"></script>
</body>
</html><%-- 
    Document   : new_invoice
    Created on : Jul 17, 2016, 4:26:09 PM
    Author     : Executive
--%>
