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

public class ShowTable
{
	@SuppressWarnings("static-access")
	public List<City> showCities()
	{		
		List<City> list=new ArrayList<City>();
		try {
			Connection con=new ConectionManager().getConnection();
			Statement stmt=con.createStatement();
			String sql="Select * from City";			
			ResultSet rs=stmt.executeQuery(sql);			
			while(rs.next())
			{
				City city=new City();
				city.setId(rs.getString("ID"));
				city.setName(rs.getString("Name"));
				city.setCountryCode(rs.getString("CountryCode"));
				city.setDistrict(rs.getString("District"));
				city.setPopulation(rs.getString("Population"));
				list.add(city);				
			}
			System.out.println("in dao");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
