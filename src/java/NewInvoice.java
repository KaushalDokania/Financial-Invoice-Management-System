import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;

public class NewInvoice extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");//type of response, as output is not to be seen on the black console(fixed for web response)
        PrintWriter pw1 = res.getWriter();//Output operation is done by it(resides in the package java.io)
       
        int n = Integer.parseInt(req.getParameter("row_count"));
        
        String[] item=new String[n];
        String[] qty=new String[n];
        int[] price=new int[n];
        int[] amount=new int[n];
        
        
        /*---------up to this all servlet code should be same----------*/
        HttpSession ses = req.getSession();
        String pid = (String)ses.getAttribute("pid");
        int inv_no = Integer.parseInt(req.getParameter("inv_no"));
        String pname= req.getParameter("pname");
        String inv_date = req.getParameter("inv_date");
        String cname = req.getParameter("cust_name");
        int amtsum = Integer.parseInt(req.getParameter("amountsum"));
        
         
        for(int i=1;i<=n;i++)
        {
            
            item[i-1] = req.getParameter("item"+i);
            
            
            qty[i-1] = req.getParameter("qty"+i);
            
            price[i-1] = Integer.parseInt(req.getParameter("price"+i));
            
            amount[i-1] = Integer.parseInt(req.getParameter("amt"+i));
            
        }
        
      
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");//type-4 driver name for oracle databases registering
            //connection with the child databasae(kd,password) by giving fulll path to the database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","fin_inv_system","password");//Connection is an interface
            Statement stmt = con.createStatement();
            Statement stmt1 = con.createStatement();//creating a statement reference required to execute a query
            Statement stmt2 = con.createStatement();
            
            //String q = "select invoice from sequence";
            //ResultSet rs = stmt.executeQuery(q);
            //if(rs.next())
            
                String q1 = "insert into invoice values('"+inv_no+"','"+inv_date+"','"+cname+"','"+amtsum+"',"+null+",'"+pid+"')";
                int x = stmt1.executeUpdate(q1);
                if(x>0)//invoice table inserted
                {
                    //inserting n items into item table
                    for(int i=0;i<n;i++)
                    {
                        String q2 = "insert into items values('"+inv_no+"','"+item[i]+"',"+qty[i]+","+price[i]+","+amount[i]+")";
                        int y = stmt2.executeUpdate(q2);
                        if(y>0)
                        {
                            pw1.println("Item"+i+" inserted successfully into items table<br/>");
                            if(i==n-1)//all items inserted
                            {
                                inv_no++;
                                String q3 = "update sequence set invoice='"+inv_no+"'";
                                
                                int z = stmt.executeUpdate(q3);

                                if(z>0)
                                {
                                    pw1.println("Thank you for registration..");
                                }
                                else
                                {
                                    pw1.println("Registration unsuccessful");//need to be reverted
                                }
                            }
                        }
                        else
                        {
                            pw1.println("Unsuceesful");
                            break;
                        }
                    }
                }
                else
                {
                    pw1.println("Insert into invoice table unsuccesful");
                }
            
            
            
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
}
