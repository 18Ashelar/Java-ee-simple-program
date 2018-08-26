

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.txw2.Document;

@WebServlet("/color_changing")
public class color_changing extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();	
	Cookie ck[]=request.getCookies();
	out.print("<html>");
	if(ck[0].getValue().equals("c1"))
	{
		
		out.print("<body bgcolor=red>");
	}
	if(ck[0].getValue().equals("c2"))
	{
		
		out.print("<body bgcolor=green>");
	}
	if(ck[0].getValue().equals("c3"))
	{
		
		out.print("<body bgcolor=yellow>");
	}
	if(ck[0].getValue().equals("c4"))
	{
		
		out.print("<body bgcolor=blue>");
	}
	if(ck[0].getValue().equals("c5"))
	{
		
		out.print("<body bgcolor=black>");
	}
	out.print("</body>");
	out.print("</html>");
	
	}



}
