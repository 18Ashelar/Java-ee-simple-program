

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/First_servlet")
public class First_servlet extends HttpServlet {
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");  
	PrintWriter out=response.getWriter();
	String user=request.getParameter("t1");
	String email=request.getParameter("t2");
	HttpSession session=request.getSession();
	session.setAttribute("userName",user);
	session.setAttribute("emailId",email);
	out.println("Succesfully log in");
	out.print("<a href=second_servlet>Visit</a>");
	}

}
