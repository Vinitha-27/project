import com.zc.component.users.ZCUser;

import java.io.IOException;

import javax.servlet.http.*;

import com.zc.component.ZCUserDetail; 

public class AdminDashboard extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse res) throws HttpServletException, IOException
    {
        resp.setContentType("text/html");
        
        PrintWriter out = res.getWriter();
  
        String Name = req.getParameter("Name");
        
        ZCUserDetail details = ZCUser.getInstance().getCurrentUser();ZCUser.getInstance().getCurrentUser();
        out.println(" Welcome User " + details.get());
        out.println("select");
        
        // this will print the Name Welcome User
        ab.close();
    }
}