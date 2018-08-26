

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sp")
public class asdf extends HttpServlet {


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
String a=request.getParameter("color");
Cookie c=new Cookie("color",a);
response.addCookie(c);
out.print("<html><body><form action=color_changing>");
out.print("<input type=submit value=change_color>");
out.print("</form></html></body>");
	}
}
