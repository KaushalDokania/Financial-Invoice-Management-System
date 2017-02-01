import java.io.*;
import java.text.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;

public class Registration extends HttpServlet{
    public static String generateID(String num)//method to generate id by concatenating no with string
    {
        int i;
        String id="P";
        for(i=6-num.length(); i>0; i--)
        {
		id += "0";
	}
	id += num;
	return id;
    }
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");//type of response, as output is not to be seen on the black console(fixed for web response)
        PrintWriter pw1 = res.getWriter();//Output operation is done by it(resides in the package java.io)
        /*---------up to this all servlet code should be same----------*/
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String passwd = req.getParameter("pwd");
        String address = req.getParameter("add");
        String dob = req.getParameter("dob");
        String ph = req.getParameter("ph");
        String sq = req.getParameter("sq");
        String sqans = req.getParameter("sqans");
        
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
            //connection with the child databasae(kd,password) by giving fulll path to the database
            
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","fin_inv_system","password");//Connection is an interface
            
            Statement stmt = con.createStatement();//creating a statement reference required to execute a query
            
            String q1 = "select partners from sequence";
            ResultSet rs1 = stmt.executeQuery(q1);
            
            
            if(rs1.next())
            {
                int no = rs1.getInt(1);//current no of rows in the partners table
                String id = "E000" + no;//partner id
                String q2 = "insert into partners values('"+id+"','"+name+"','"+email+"','"+passwd+"','"+address+"','"+dob+"','"+ph+"','"+sq+"','"+sqans+"')";
                int x = stmt.executeUpdate(q2);
                if(x>0)//insert succesful
                {
                    
                    no++;//increment the count value
                    String q3 = "update sequence set partners='"+no+"'";
                    
                    int y = stmt.executeUpdate(q3);
                    
                    if(y>0)
                    {
                        pw1.println("Thank you for registration..Your ID is "+id+"<br/><a href=\"login-register.jsp\">Click here</a> to go login page");
                    }
                    else
                    {
                        pw1.println("Registration unsuccessful");//need to be reverted
                    }
                }
                else
                {
                    pw1.println("Registration unsuccessful");
                }
            }
            else
            {
                pw1.println("Error fetching sequence table");
            }
            
               
                
            con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
}
