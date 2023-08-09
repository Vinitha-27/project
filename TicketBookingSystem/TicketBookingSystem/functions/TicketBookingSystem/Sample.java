import java.util.logging.Logger;
import java.util.logging.Level;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.catalyst.advanced.CatalystAdvancedIOHandler;
import com.zc.api.APIConstants.ZCUserScope;
import com.zc.common.ZCProject;
import com.zc.component.zcql.ZCQL;

public class Sample implements CatalystAdvancedIOHandler {
	private static final Logger LOGGER = Logger.getLogger(Sample.class.getName());
	
	@Override
    public void runner(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			switch(request.getRequestURI()) {
				case "/admin": {
					RequestDispatcher rd=request.getRequestDispatcher("AdminDashboard"); 
					rd.forward(request, response);//method may be include or forward  
				}
				case "/user": {
					RequestDispatcher rd=request.getRequestDispatcher("UserDashboard");  
					rd.forward(request, response);//method may be include or forward  
				}
				default: {
					response.setStatus(404);
					response.getWriter().write("You might find the page you are looking for at \"/\" path");
				}
			}
		}
		catch(Exception e) {
			LOGGER.log(Level.SEVERE,"Exception in Sample",e);
			response.setStatus(500);
			response.getWriter().write("Internal server error");
		}
	}
	
}