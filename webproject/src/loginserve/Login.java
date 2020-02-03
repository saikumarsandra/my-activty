package loginserve;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username= request.getParameter("username");
		String  password= request.getParameter("password");
		PrintWriter  writer=	response.getWriter();
	/*	if(username.equals("first")&& password.equals("abc"))
		{
			writer.
			response.sendRedirect("welcome.html");
		}
		else
		{
			response.sendRedirect("error.html");
		}*/
		
		if(username.equals("first")&& password.equals("abc"))
		{
		
			this.getServletContext().getRequestDispatcher("/welcome.html").forward(request, response);
		}
		else
		{
			this.getServletContext().getRequestDispatcher("/error.html").forward(request, response);
		}
	}	

}
