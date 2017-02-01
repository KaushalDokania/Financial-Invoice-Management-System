import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;

public class Delete extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");//type of response, as output is not to be seen on the black console(fixed for web response)
        PrintWriter pw1 = res.getWriter();//Output operation is done by it(resides in the package java.io)
        /*---------up to this all servlet code should be same----------*/
        String table_name = req.getParameter("table_name");
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
            //connection with the child databasae(kd,password) by giving fulll path to the database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","fin_inv_system","password");//Connection is an interface
            Statement stmt = con.createStatement();//creating a statement reference required to execute a query
            String q1 = "delete from invoice";
            int x = stmt.executeUpdate(q1);
            if(x>0)   //user exist
            {
              
                pw1.println("Deleted");
                
            }
            else
                pw1.println("Not deleted");
            con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
}
