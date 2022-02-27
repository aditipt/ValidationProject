package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("userName");

		String pass = request.getParameter("password");
		
		if( name.equals("admin") && pass.equals("admin123")) {
			
			RequestDispatcher obj = request.getRequestDispatcher("/dash");
			obj.forward(request, response);
			
		}
		
		else {
			
			out.print("Incorrect username or password !!!!!!");
			RequestDispatcher obj = request.getRequestDispatcher("login.html");
			obj.include(request, response);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
