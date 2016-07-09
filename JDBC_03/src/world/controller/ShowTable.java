package world.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import world.model.City;
import world.model.ConectionManager;
import world.model.Country;
import world.model.CountryLanguage;

public class ShowTable
{
	

		// ***********For Getting List Of All Values From
		
		public List<Country> listCountry() throws SQLException {
			Connection con=new ConectionManager().getConnection();
			List<Country> list = new ArrayList<>();
			PreparedStatement ps = null;
			ResultSet res = null;
			String sql = "select country1.code,country1.name,country1.continent,country1.region,"+
					      "country1.population,country1.capital,"+
					      "country1.headOfState,city1.id,city1.name,city1.countryCode,city1.district,"+
					      "city1.population,cl.countryCode,cl.language,cl.isOfficial,cl.percentage "+
					      " from country country1 "+
					      " join city city1 ON country1.code=city1.countryCode "+
					      " join countrylanguage cl ON cl.countryCode=country1.code  ";
			
			try {
				 con=new ConectionManager().getConnection();
				ps = con.prepareStatement(sql);
				res = ps.executeQuery();
				
				while (res.next()) {
					Country country = new Country();
					country.setCode(res.getString("country1.code"));
					country.setName(res.getString("country1.name"));
					country.setContinent(res.getString("country1.continent"));
					country.setRegion(res.getString("country1.region"));
					country.setPopulation(res.getString("country1.population"));
					country.setCapital(res.getString("country1.capital"));
					country.setHeadOfState(res.getString("country1.headOfState"));
					country.setCity(new City(res.getString("city1.id"),res.getString("city1.name"),res.getString("city1.countryCode"),res.getString("city1.district"),res.getString("city1.population")));
					country.setCountryLanguage(new CountryLanguage(res.getString("cl.countryCode"),res.getString("cl.language"),res.getString("cl.isOfficial"),res.getString("cl.percentage")));
					list.add(country);
				}
				//System.out.println("you are in list..."+list);

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;
		}

	public void cityUpdate(world.model.City city) throws SQLException
	{		
		Connection con=new ConectionManager().getConnection();
		try
		{			
			PreparedStatement pstmt=null;
			String sql= "Update City SET name = ?,countrycode = ?,district = ?,population =? Where id = ?";
			pstmt=con.prepareStatement(sql);		
			pstmt.setString(1,city.getName());
			pstmt.setString(2,city.getCountryCode());
			pstmt.setString(3,city.getDistrict());
			pstmt.setString(4, city.getPopulation());
			pstmt.setString(5, city.getId());											
			pstmt.executeUpdate();			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			con.close();
		}		
	}

	public void cityDelete(City city) throws SQLException {
		//System.out.println("delete");
		PreparedStatement pstmt=null;
		Connection con=new ConectionManager().getConnection();
		String sql="Delete FROM City where Id =?";
		try{
			
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, city.getId());
			pstmt.executeUpdate();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			con.close();
		}
	}

	public void cityInsert(City city) throws SQLException {
		PreparedStatement pstmt=null;
		Connection con=new ConectionManager().getConnection();
		String sql = "INSERT INTO City (name,countrycode,district,population) VALUES(?,?,?,?)";
		try{
			
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, city.getName());
			pstmt.setString(2, city.getCountryCode());
			pstmt.setString(3, city.getDistrict());
			pstmt.setString(4, city.getPopulation());
			pstmt.executeUpdate();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			con.close();
		}
	}
}
