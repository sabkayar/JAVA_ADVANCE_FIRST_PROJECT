package login;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class WelcomeServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		out.println("Reached");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
	
		//Existing session will be reused and no new session will be created.
		HttpSession ses1=req.getSession(false);
		
		String userName=(String)ses1.getAttribute("loginval");
        String passWord=(String)ses1.getAttribute("passval");
		System.out.println(userName+" "+passWord);
	
	
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		PrintWriter out=resp.getWriter();
		
		//Existing session will be reused and no new session will be created.
		HttpSession ses1=req.getSession(false);
		
		String userName=(String)ses1.getAttribute("loginval");
        String passWord=(String)ses1.getAttribute("passval");
		System.out.println(userName+" "+passWord);
	}
}