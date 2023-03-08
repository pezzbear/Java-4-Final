import java.sql.*;
/**
 * Throws exceptions for the derby database
 * 
 */
public class DatabaseControls {
	
	
	public void GetItem() throws SQLException{
		String urlString = "jdbc:derby:gameDatabase";
		try(
			Connection conn = DriverManager.getConnection(urlString);
			Statement stmt = conn.createStatement();
			ResultSet rSet = stmt.executeQuery("SELECT name FROM item")
		) {
			while(rSet.next()) {
				System.out.println(rSet.getString("name"));
				
			}
		}
	}
}
