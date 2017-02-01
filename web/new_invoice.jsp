<%@page import="java.sql.*" %>
<html>
<head>
<title>New Invoice</title>
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

<script>
		var items=2;
		var x;
		function addItem()
		{
			var x=document.getElementById('t1');
			   // deep clone the targeted row
			var new_row = x.rows[1].cloneNode(true);
			   // get the total number of rows
			var len = x.rows.length;
			   // set the innerHTML of the first row 
			new_row.cells[0].innerHTML = len;

			   // grab the input from the first cell and update its ID and value
			var inp1 = new_row.cells[1].getElementsByTagName('input')[0];
			inp1.id += 'item'+len;
			inp1.value = '';
			inp1.name = 'item' + len;

			   // grab the input from the first cell and update its ID and value
			var inp2 = new_row.cells[2].getElementsByTagName('input')[0];
			inp2.id += 'qty'+len;
			inp2.value = '';
			inp2.name = 'qty' + len;
			
			var inp3 = new_row.cells[3].getElementsByTagName('input')[0];
			inp3.id += 'price'+len;
			inp3.value = '';
			inp3.name = 'price' + len;
			
			var inp4 = new_row.cells[4].getElementsByTagName('input')[0];
			inp4.id += 'amt'+len;
			inp4.value = '';
			inp4.name = 'amt' + len;

			   // append the new row to the table
			x.appendChild( new_row );
                        //window.alert("len="+len);
                        document.getElementById('row_count').value=len;
		}
		function deleteItem(row)
		{
			var i=row.parentNode.parentNode.rowIndex;
			document.getElementById('t1').deleteRow(i);
		}
                function calculateSum()
                {
                   var sum = 0;
                    var x=document.getElementById('t1');
			   // deep clone the targeted row
                    
			   // get the total number of rows
                    var len = x.rows.length;
                    for(var i=1;i<=len-1;i++)
                    {   
                        var new_row = x.rows[i].cloneNode(true);
                        var inp2 = new_row.cells[2].getElementsByTagName('input')[0];
                        var inp3 = new_row.cells[3].getElementsByTagName('input')[0];
                        var inp4 = new_row.cells[4].getElementsByTagName('input')[0];
                        var z = parseInt(inp2.value) * parseInt(inp3.value);
                        inp4.value = z;
                        sum += z;
                       // window.alert("x = "+x+"name="+inp4.name+"len="+(len-1));
                        
                    }
                   document.getElementById('totalsum').value=sum;
                   
                }
	</script>

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
                                                                                                <br/><br/>
                                                                                                <%
                                                                                                    String pname="";
                                                                                                    int inv_no=0;
                                                                                                    String pid = (String)session.getAttribute("pid");
                                                                                                    out.println(pid);
                                                                                                    try
                                                                                                    {
                                                                                                        Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
                                                                                                        //connection with the child databasae(kd,password) by giving fulll path to the database
                                                                                                        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","fin_inv_system","password");//Connection is an interface
                                                                                                        Statement stmt1 = con.createStatement();//creating a statement reference required to execute a query
                                                                                                        Statement stmt2 = con.createStatement();
                                                                                                        String q1 = "select * from partners where id='"+pid+"'";
                                                                                                        String q2 = "select invoice from sequence";
                                                                                                            
                                                                                                        ResultSet rs1 = stmt1.executeQuery(q1);//if query runs sucessfully it gives a +ve value
                                                                                                        ResultSet rs2 = stmt2.executeQuery(q2);
                                                                                                        if(rs1.next() )   //both query runs
                                                                                                        {
                                                                                                            if(rs2.next())
                                                                                                            {
                                                                                                                
                                                                                                                pname = rs1.getString("name");
                                                                                                                inv_no = rs2.getInt("invoice");
                                                                                                                
                                                                                                            }
                                                                                                            else
                                                                                                                out.println("<h1>Else part executed of rs2</h1>");
                                                                                                        }
                                                                                                        else
                                                                                                            out.println("<h1>Else part executed of rs1</h1>");
                                                                                                        con.close();
                                                                                                    }
                                                                                                    catch(Exception e)
                                                                                                    {
                                                                                                        out.println(e);
                                                                                                      }
                                                                                                %>
                                                                                                <div>
                                                                                                    <form method="post" action="NewInvoice">
                                                                                                        <table width=900 border=2 cellspacing=0 cellpadding=8 id="inv_details">
                                                                                                            <tr><td>Invoice NO : </td><td><input type="text" name="inv_no" readonly value="<%= inv_no %>"></td></tr>
                                                                                                            <tr><td>Dealer's Name : </td><td><input type="text" name="pname" readonly value="<%= pname %>"></td></tr>
                                                                                                            <tr><td>Date : </td><td><input type="date" name="inv_date"></td></tr>
                                                                                                            <tr><td>Customer Name : </td><td><input type="text" name="cust_name"></td></tr>
                                                                                                        </table>
                                                                                                        <table width=900 border=2 cellspacing=0 cellpadding=8 id="t1">
                                                                                                                <tr id="row0">
                                                                                                                        <th width=50>S.No.</th>
                                                                                                                        <th width=200>Item Name</th>
                                                                                                                        <th width=200>Quantity</th>
                                                                                                                        <th width=200>Price</th>
                                                                                                                        <th width=200>Amount</th>
                                                                                                                        <th width=30></th>
                                                                                                                </tr>
                                                                                                                <tr id="row1">
                                                                                                                        <td>1</td>
                                                                                                                        <td><input type="text" name="item1"/></td>
                                                                                                                        <td><input type="text" name="qty1"/></td>
                                                                                                                        <td><input type="text" name="price1"/></td>
                                                                                                                        <td><input type="text" name="amt1"/></td>
                                                                                                                        <td><input type="button" value="X" onclick="deleteItem(this)"/></td>
                                                                                                                </tr>		
                                                                                                        </table>
                                                                                                        <table width=900 cellspacing=0 cellpadding=8>
                                                                                                                <tr>
                                                                                                                        <td width=50></td>
                                                                                                                        <td width=200><input type="button" value="Add Item" onclick="addItem()"/></td>
                                                                                                                        <td width=200></td>
                                                                                                                        <td width=200>Total Amount</td>
                                                                                                                        <td width=200>&nbsp;&nbsp;&nbsp;<input type="text" id="totalsum" name="amountsum"/></td>
                                                                                                                        <td width=30><input type="button" value="SUM" onclick="calculateSum()"></td>
                                                                                                                </tr>
                                                                                                        </table>
                                                                                                        <input type="hidden" name="row_count" id="row_count" value='1'/>
                                                                                                        <input type="submit"/>
                                                                                                </form>
                                                                                                    
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
										<li><a href="dashboard.jsp"><i class="fa fa-tachometer"></i> <span>Dashboard</span></a></li>
                                                                                <li id="menu-academico" ><a href="new_invoice.jsp?type=all"><i class="fa fa-file-text-o"></i> <span>New Invoice</span> </a></li>
										 <li id="menu-academico" ><a href="all_invoices.jsp?type=all"><i class="fa fa-table"></i> <span>All Invoices</span> </a></li>
                                                                                 <li id="menu-academico" ><a href="dues.jsp?type=all"><i class="fa fa-table"></i> <span>Dues</span> </a></li>
                                                                                <li><a href="payments.jsp?type=all"><i class="lnr lnr-pencil"></i> <span>Payments</span></a></li>
                                                                                <li id="menu-academico" ><a href="#"><i class="lnr lnr-book"></i> <span>Update Profile</span></a></li>
                                                                                <li id="menu-academico" ><a href="Logout?logout=true"><i class="lnr lnr-book"></i> <span>Logout</span></a></li>
									 
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
