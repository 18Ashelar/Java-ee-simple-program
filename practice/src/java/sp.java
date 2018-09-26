

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns = {"/sp"})
public class sp extends HttpServlet {
        static int i=1;
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
     PrintWriter out=response.getWriter();
     String u=request.getParameter("uname");
     String p=request.getParameter("pwd");
     String  t=String.valueOf(i);
     if(p.equals("Akshay"))
     {
         HttpSession session=request.getSession();
         session.setAttribute("uname",t);

String jg=(String)session.getAttribute("uname");
int j=Integer.valueOf(jg);
         if(j==1)
         {
             out.print("Welcome "+" "+u);
         }
         else
         {
             out.print("YOU VISITED "+j+" "+"Times");
         }
         i++;
        }
     else
     {
         out.print("Invalid user name");
         request.getRequestDispatcher("index.html").include(request, response);
     }
     out.print("<form action=spz>");
     out.print("<input type=submit value=Logout>");
     out.print("</form>");
    }
}
