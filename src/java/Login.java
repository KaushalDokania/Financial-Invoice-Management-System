import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");//type of response, as output is not to be seen on the black console(fixed for web response)
        PrintWriter pw1 = res.getWriter();//Output operation is done by it(resides in the package java.io)
        /*---------up to this all servlet code should be same----------*/
        String pid = req.getParameter("id");
        String passwd = req.getParameter("pwd");
        
        if(pid.equals("admin") && passwd.equals("123"))
        {
            HttpSession ses = req.getSession();//creating session
            ses.setAttribute("pid","admin");//setting session value to server side  
            res.sendRedirect("admin.jsp");
        }
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
            //connection with the child databasae(kd,password) by giving fulll path to the database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","fin_inv_system","password");//Connection is an interface
            Statement stmt = con.createStatement();//creating a statement reference required to execute a query
            String q1 = "select * from partners where id='"+pid+"'";
            ResultSet rs = stmt.executeQuery(q1);//if query runs sucessfully it gives a +ve value
            if(rs.next())   //user exist
            {
                HttpSession ses = req.getSession();//creating session
                ses.setAttribute("pid",pid);//setting session value to server side    
                String pwd = rs.getString("password");
                //res.sendRedirect("dashboard.jsp");
                pw1.println("Welcome!! Login Successful");
                pw1.println("Session ID : "+ses.getAttribute("pid"));
                pw1.println("<br/><a href=\"dashboard.jsp\"><b>Click here</b></a> to go to your homepage.");
                
            }
            else
                pw1.println("This email is not registered..<a href=\"login-register.html\">Click Here</a> to for a new registration or login with a different email.");
            con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
}
