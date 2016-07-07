package world.domain;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import world.service.PropertyManager;



public class ConnectionManager {


	public static Connection getConnection() throws SQLException
		{
		

		Connection conn=null;
	
	{
		if(conn==null)
	try {
		
		Class.forName(PropertyManager.getProperty("driver")) ;
		System.out.println("driver loaded");
		conn = DriverManager.getConnection(PropertyManager.getProperty("url"), PropertyManager.getProperty("user"), PropertyManager.getProperty("password"));
		System.out.println("Connection Established");
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return conn;
}
	
}
	

}
