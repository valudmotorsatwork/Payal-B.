package world.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import world.model.City;
import world.model.Country;



@WebServlet("/CityController")
public class CityController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ShowTable obj;
	
	public CityController() {
        super();
        obj =new ShowTable();
        }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		List<Country> list;
		try {
			list = obj.listCountry();
			Gson gson=new Gson();  
			response.setContentType("application/json");
			response.getWriter().write(gson.toJson(list));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}



	private world.model.City parseRequest(HttpServletRequest request) throws ServletException, IOException {
		world.model.City city=new City();
		city.setId(request.getParameter("id"));
		city.setName(request.getParameter("name"));
		city.setCountryCode(request.getParameter("countryCode"));
		city.setDistrict(request.getParameter("district"));
		city.setPopulation(request.getParameter("population"));
		return city;
	}
	
	

}
