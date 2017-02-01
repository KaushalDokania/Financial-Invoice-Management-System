import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;

public class Logout extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");//type of response, as output is not to be seen on the black console(fixed for web response)
        PrintWriter pw1 = res.getWriter();//Output operation is done by it(resides in the package java.io)
        /*---------up to this all servlet code should be same----------*/
        String x = req.getParameter("logout");
        //pw1.println("x = "+x);
        if(x.equals("true"))
        {
            HttpSession ses = req.getSession();//creating session
            ses.setAttribute("pid",null);//setting session value to server side    
            pw1.println("Logout Successful");
            pw1.println("<br/><a href=\"index.html\">Click here</a> to Continue to hompegae");
            
        }
        else
            pw1.println("else part executed");
    }
}
