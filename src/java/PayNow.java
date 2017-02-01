import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.text.*;

public class PayNow extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");//type of response, as output is not to be seen on the black console(fixed for web response)
        PrintWriter pw1 = res.getWriter();//Output operation is done by it(resides in the package java.io)
        /*---------up to this all servlet code should be same----------*/
        HttpSession ses = req.getSession();
        String pid = (String)ses.getAttribute("pid");
        float paid_amt = Float.parseFloat(req.getParameter("total_due"));
        pw1.println("Hello");
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
            //connection with the child databasae(kd,password) by giving fulll path to the database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","fin_inv_system","password");//Connection is an interface
            Statement stmt1 = con.createStatement();//creating a statement reference required to execute a query
            Statement stmt2 = con.createStatement();
            Statement stmt3 = con.createStatement();
            Statement stmt4 = con.createStatement();
            
            String q1 = "select payment from sequence";
            ResultSet rs1 = stmt1.executeQuery(q1);
            
            if(rs1.next())
            {
                int no = rs1.getInt(1);//current no of rows in the partners table
                String id = "P000" + no;//partner id
                
                //-----getting system date------
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DATE, 1);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                System.out.println(cal.getTime());
                // Output "Wed Sep 26 14:23:28 EST 2012"
                String date = sdf.format(cal.getTime());
                //----------------------------------
                String q2 = "insert into payment values('"+id+"','"+pid+"','"+date+"',"+paid_amt+")";
                int x = stmt2.executeUpdate(q2);
                if(x>0)//insert succesful
                {
                    
                    String q3 = "update invoice set paid='"+date+"' where pid='"+pid+"' and paid is null";
                    int y = stmt3.executeUpdate(q3);
                    if(y>0)   //user exist
                    {
                        no++;//increment the count value
                        String q4 = "update sequence set payment='"+no+"'";
                        int z = stmt3.executeUpdate(q4);
                        if(z>0)
                        {
                            pw1.println("Your payment has been made");
                            pw1.println("<a href=\"all_invoices.jsp\">Click Here</a> to Go Back");
                        }
                        else
                            pw1.println("Payment Unsuccessful,sequence update failed");
                    }
                    else
                        pw1.println("Payment Unsuccessful,invoice update failed");
                }
                else
                {
                    pw1.println("Payment unsuccessful,insert payment failed");
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
