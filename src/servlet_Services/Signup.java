package servlet_Services;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;
import service.UserService;

public class Signup extends HttpServlet {
	private Student student ;
	private UserService userservice;
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		this.student = new Student();
		this.userservice = new UserService();
		student.setName(req.getParameter("name"));
		student.setEmailid(req.getParameter("emailid"));
		student.setPassword(req.getParameter("password"));
		if(this.userservice.signup(this.student))
			res.getWriter().print("User data is saved sucessfully");
		
		
	}

}
