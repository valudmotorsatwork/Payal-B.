package world.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import world.model.ConectionManager;

public class LoginUser {
	public boolean authenticate(String username, String password)
	{
		boolean check = false;
		try {
			ConectionManager connection = new ConectionManager();
			
			Connection conn=connection.getConnection();
			PreparedStatement stmt;
			ResultSet rs=null;
			System.out.println("Hello");
			String searchQuery ="select * from Login where username=? and password=?";
			stmt=conn.prepareStatement(searchQuery);
			stmt.setString(1, username);
			stmt.setString(2, password);
			rs=stmt.executeQuery();
			System.out.println(rs);
			 if(rs.next())
				 check=true;
			System.out.println(check);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return check;
	}
	

}
