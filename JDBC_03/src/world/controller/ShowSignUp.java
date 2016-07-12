package world.controller;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import world.model.ConectionManager;

import world.model.SignUp;

public class ShowSignUp 
{
	boolean check=true;
	public boolean showSignUp(SignUp signup) throws SQLException
	{
		Connection con=new ConectionManager().getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		//boolean flag=false;
		pstmt=con.prepareStatement("select * from SignUp where email=?");
		rs=pstmt.executeQuery();
		if(rs.next())
		{
			check=true;
		}
		else{
		
		
			String sql="insert into SignUp values (?,?,?,?)";


//List<SignUp> list=new ArrayList<SignUp>();

		try {
			
			
			
			pstmt=con.prepareStatement(sql);
			
			
			pstmt.setString(1,signup.getEmail());
			pstmt.setString(2,signup.getFirstname());
			pstmt.setString(3,signup.getLastname());
			pstmt.setString(4,signup.getPassword());
			
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
		return check;
}
}