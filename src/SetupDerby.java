import java.sql.*;

import org.apache.derby.jdbc.EmbeddedDataSource;
/**
 * Class to setup the Derby database
 * 
 */
public class SetupDerby {

	public static void main(String[] args) throws Exception {

		try {
			
			EmbeddedDataSource ds = new EmbeddedDataSource();
			ds.setDatabaseName("gameDatabase");
			ds.setCreateDatabase("create");
			
			Connection conn = ds.getConnection();
			
			Statement stmt = conn.createStatement();

			System.out.println(conn);

			try {
				stmt.executeUpdate("DROP TABLE itemDesc");
			}catch(Exception e) {
				System.out.println("Could not drop table itemDesc, itemDesc table does not exist.");
			}
			
			try {
				stmt.executeUpdate("DROP TABLE item");
			}catch(Exception e) {
				System.out.println("Could not drop table item, item table does not exist.");
			}
			
			stmt.executeUpdate("CREATE TABLE item ("
					+ "id INTEGER PRIMARY KEY, "
					+ "name VARCHAR(255))");

			stmt.executeUpdate("CREATE TABLE itemDesc ("
					+ "id INTEGER PRIMARY KEY, "
					+ "species_id integer REFERENCES item (id), "
					+ "name VARCHAR(255), "
					+ "description VARCHAR(500))");

			stmt.executeUpdate("INSERT INTO item VALUES (1, 'Fancy Mirror')");
			stmt.executeUpdate("INSERT INTO item VALUES (2, 'Makeup')");
			stmt.executeUpdate("INSERT INTO item VALUES (3, 'Outfit')");
			stmt.executeUpdate("INSERT INTO item VALUES (4, 'Red Nose')");

			stmt.executeUpdate("INSERT INTO itemDesc VALUES (1, 1, 'Fancy Mirror', 'Its a fancy looking mirror')");
			stmt.executeUpdate("INSERT INTO itemDesc VALUES (2, 2, 'Makeup', 'White and black face paint')");
			stmt.executeUpdate("INSERT INTO itemDesc VALUES (3, 3, 'Outfit', 'White and frilly')");
			stmt.executeUpdate("INSERT INTO itemDesc VALUES (4, 4, 'Red Nose', 'Big and squeaky')");

			//String userInput = "Elsa'DROP TABLE * '";

			ResultSet rs = stmt.executeQuery("select id, "
					+ "							species_id, "
					+ "								  name, "
					+ "								description "
					+ "							from itemDesc");
			//+ "							where name = '" + userInput + "'");

			//scaryDelete(conn, "Elsa");
			
			// SQL Injection
			//scaryDelete(conn, "any' or 1 = ;1 or name='any");
			safeDelete(conn, "any' or 1 = 1 or name='any");
			
			while(rs.next()) {
				System.out.println("Item Name: " + rs.getString("name"));
				System.out.println("Item Description:" + rs.getString("description"));
				System.out.println(rs.getInt(1)); 
			}

		}catch(SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getSQLState());
			System.out.println(e.getErrorCode());
		}catch(Exception e) {
			
		}finally {
			
		}
	}
	
private static void safeDelete(Connection conn, String name) throws SQLException{
		
		PreparedStatement ps = conn.prepareStatement("delete from itemDesc "
												  + "where name = ?");
		
		ps.setString(1, name);
		
		System.out.println(ps.toString());
		
		ps.execute();
		
	}
	
	
}
