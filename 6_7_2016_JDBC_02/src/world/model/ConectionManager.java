package world.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConectionManager
{
	public static Connection getConnection() throws SQLException
	{
		Connection conn=null;
		{		
				try {
					Class.forName("com.mysql.jdbc.Driver") ;
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/World","sa","sa123");					
				}
			catch (Exception e) {
				e.printStackTrace();
			}
			return conn;
		}
	}
}
