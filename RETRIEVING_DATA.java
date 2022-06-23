import java.sql.*;

public class RETRIEVING_DATA {
	
	public static void main(String args[]) {
	
		try {
			
			Connection con = null;
			Statement stmt = null;
			
			con = DriverManager.getConnection("jdbc:sqlite:/C:\\sqlite\\db\\MYMOVIESDB.db");
			
			System.out.println("Connected to Database Successfully!!!");
			
			stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery( "SELECT * FROM MOVIES;" );
			
			while ( rs.next() ) {
				
				String mname= rs.getString("Movie_Name");
				
				String mdirname = rs.getString("Director_Name");
				
				String mlactor = rs.getString("Lead_Actor");
				
				String mlactress = rs.getString("Lead_Actress");
				
				Integer rel_year = rs.getInt("Release_YEAR");
				
				System.out.println( "Movie Name    : " + mname );
				
				System.out.println( "Director Name : " + mdirname );
				
				System.out.println( "Lead Actor    : " + mlactor );
				
				System.out.println( "Lead Actress  : " + mlactress );
				
				System.out.println( "Release year  : " + rel_year );
				
				
				
				System.out.println();
				
			}
			
			rs.close();
			
			stmt.close();
			
			con.close();
		} 
		catch( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		System.out.println("Data has been retrieved successfully!!!!");

	}
}


