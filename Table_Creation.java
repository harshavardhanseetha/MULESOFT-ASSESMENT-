import java.sql.*;

public class Table_Creation {

	public static void main(String[] args) {
		
		try {
			
			Connection con = null;
			Statement stmt = null;
			
			con = DriverManager.getConnection("jdbc:sqlite:/C:\\sqlite\\db\\MYMOVIESDB.db");
			
			System.out.println("Connected to Database Successfully!!!");
			
			stmt = con.createStatement();
			
			String qry = "CREATE TABLE MOVIES " +
			"(Movie_Name TEXT NOT NULL," +
			" Director_Name TEXT NOT NULL, " +
			" Lead_Actor TEXT NOT NULL, " +
			" Lead_Actress TEXT NOT NULL, " +
			" Release_YEAR INTEGER NOT NULL)";
			
			stmt.executeUpdate(qry);
			
			stmt.close();
			
			con.close();
		} 
		catch( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		System.out.println("Table has been Created successfully!!!!");
	}

}
