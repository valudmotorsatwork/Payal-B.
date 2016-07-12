
	package world.controller;


	import java.io.IOException;
	import java.io.PrintWriter;


	import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



	
	@SuppressWarnings("serial")
	@WebServlet(name = "LoginServlet", urlPatterns = { "/LoginServlet" })
	public class LoginServlet extends HttpServlet {
		
	    
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
		}

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("in login servlet");
			//response.setContentType("application/gson");
			String userName,Password;
			PrintWriter out=response.getWriter();
			HttpSession session=request.getSession();
			userName=request.getParameter("userName");	
			Password=request.getParameter("password");
			System.out.println(userName+" "+Password);
			LoginUser l = new LoginUser();
			boolean loginResult=l.authenticate(userName,Password);
			System.out.println("hi");
			if(!loginResult)
			{
				//boolean loginResult=false;
				System.out.println("Login Unsuccessful");
				//out.println("Login Unsuccessful");
				if(loginResult==false){
				session.setAttribute("loginResult", "Enter the user name password correctly..");
				response.sendRedirect("Login.jsp");
				}
			}
			else
			{
				System.out.println("Login Successful");
				//HttpSession session=request.getSession();
				session.setAttribute("userName", userName);
				//request.setAttribute("userName", userName);
				response.sendRedirect("Display.jsp");
				out.println("Login Successful");
			}
			
			
		}

	}


	


