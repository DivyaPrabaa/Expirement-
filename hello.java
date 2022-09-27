import java.io.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hello
 */
@WebServlet("/hello")
public class hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private int visits=0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter srout=response.getWriter();
		visits++;
		String username=request.getParameter("usertxt");
		String password=request.getParameter("passwordtxt");
		if((username.equals("adminstratior"))&&(password.equals("saml")))
			srout.println("<html> <head> <title> Hello </title> </head> <body> <h1> Flower </h1> </body></html>");
		else
		srout.println("<html> <head> <title> Hello </title> </head> <body> <h1> Incorrect usernmae and password</h1></body></html>");
		srout.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
