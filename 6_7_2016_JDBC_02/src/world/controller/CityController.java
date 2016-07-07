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



@WebServlet("/CityController")
public class CityController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       ShowTable st=null;
   
    public CityController() {
        super();
         st=new ShowTable();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	try{
    	List<City> cities=st.showCities();
    	Gson gson=new Gson();
    	response.setContentType("application/json");
    	response.getWriter().write(gson.toJson(cities));
    	
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Gson g=new Gson();
			try {
				world.model.City city=parseRequest(request);
				if(request.getParameter("action").equals("update"))
					st.cityUpdate(city);// calling the cityUpdate method
				else if(request.getParameter("action").equals("delete"))
					st.cityDelete(city);// calling cityDelete method
				else if(request.getParameter("action").equals("insert"))
					st.cityInsert(city);// calling cityInsert method
					response.getWriter().write(g.toJson(city));
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
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
