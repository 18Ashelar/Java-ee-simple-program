

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/first_ser")
public class first_ser extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();

	Double no1=Double.parseDouble(request.getParameter("t1"));
	double no2=Double.parseDouble(request.getParameter("t2"));
	double no3=Double.parseDouble(request.getParameter("t3"));
	double no4=Double.parseDouble(request.getParameter("t4"));
	double average;
average=(no1+no2+no3+no4)/4;
	
	if(average>=6.65)
	{
	RequestDispatcher rd=request.getRequestDispatcher("second_servlet");
	rd.forward(request, response);
	}
	else
	{
		out.print("Sorry!! Your are not eligible for campus placement!!!!!");
		RequestDispatcher rd=request.getRequestDispatcher("index");
		rd.include(request, response);
	
	}
	}

}
