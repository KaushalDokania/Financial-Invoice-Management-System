import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;

public class ForgotPassword extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");//type of response, as output is not to be seen on the black console(fixed for web response)
        PrintWriter pw1 = res.getWriter();//Output operation is done by it(resides in the package java.io)
        /*---------up to this all servlet code should be same----------*/
        String email = req.getParameter("email");
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
            //connection with the child databasae(kd,password) by giving fulll path to the database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","fin_inv_system","password");//Connection is an interface
            Statement stmt = con.createStatement();//creating a statement reference required to execute a query
            
            HttpSession ses = req.getSession();//creating session
            ses.setAttribute("ssid",email);//setting session value to server side
            
            String q1 = "select * from partners where email='"+email+"'";
            ResultSet rs = stmt.executeQuery(q1);//if query runs sucessfully it gives a +ve value
            
          
            if(rs.next())   //user exist
            {
                    String sq = rs.getString("sq");//fetching security question
                    pw1.println("<html><body>"
                                        +"<form method=post action=NewPassword>"
                                            +"Security Question : <input type=text name=sq value="+sq+" readonly/>"
                                            +"Security Answer : <input type=text name=sans />"
                                            +"<input type=\"submit\" value=\"Submit\"/>"
                                        + "</form>"
                                    + "</body></html>");
                
            }
            else
                pw1.println("Invalid email..<a href=\"login-register.html\">Click Here</a> to go back.");
            con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
}
