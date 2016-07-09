package world.main;
import java.sql.SQLException;

/***
 * Payal Datta Balsetwar
 * JDBC 02
 */
import world.controller.ShowTable;

public class Application {

	public static void main(String[] args) throws SQLException {
		ShowTable st=new ShowTable();
		st.listCountry();
	}

}
