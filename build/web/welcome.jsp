<%@page import="java.sql.*" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
        <style>
            #myname {
                color:blue;
            }
        </style>
    </head>
    <body>
        <%
        String nm="";
        String pid = (String)session.getAttribute("pid");//creating session    
        try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","fin_inv_system","password");
                
                Statement stmt = con.createStatement();
                String q1 = "select * from partners where id='"+pid+"'";
                ResultSet rs = stmt.executeQuery(q1);
                
                if(rs.next())
                {
                    nm = rs.getString("name");
                }
                else
                {
                    out.println("Sorry, you need to login first!!");
                }
            }
            catch(Exception e)
            {
                out.println(e);
            }
    %>
        <h1>Hello <span id="myname"><% out.println(nm); %>!!</span></h1>
        <a href="Logout?logout=true">Logout</a>
    </body>
</html>
