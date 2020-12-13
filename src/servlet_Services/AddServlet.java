package servlet_Services;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	public void service(HttpServletRequest req , HttpServletResponse res)
	{
		try {
			int a  = Integer.parseInt(req.getParameter("num1"));
			int b =  Integer.parseInt(req.getParameter("num2"));
			res.getWriter().print("Response from the server says"+(a+b));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
