package world.controller;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import world.model.SignUp;


/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SignUp signup=new SignUp();
		signup=parseRequest(request);
		PrintWriter out=response.getWriter();
		ShowSignUp showsignup=new ShowSignUp();
	
		boolean check;
		try {
			check = showsignup.showSignUp(signup);
			if(check)
			{
				out.println("Sign Up Successfull");
			}
			else
			{
				out.println("user already exists");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private world.model.SignUp parseRequest(HttpServletRequest request) throws ServletException, IOException {
		
		SignUp signup=new SignUp();
		
		signup.setEmail(request.getParameter("email"));
		signup.setFirstname(request.getParameter("firstname"));
		signup.setLastname(request.getParameter("lastname"));
		signup.setPassword(request.getParameter("password"));
		return signup;
		
	}
}
