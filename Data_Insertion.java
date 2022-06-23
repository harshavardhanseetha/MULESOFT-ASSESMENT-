import java.sql.*;
public class Data_Insertion {

	public static void main(String[] args) {
		try {
			
			Connection con = null;
			Statement stmt = null;
			
			con = DriverManager.getConnection("jdbc:sqlite:/C:\\sqlite\\db\\MYMOVIESDB.db");
			
			System.out.println("Connected to Database Successfully!!!");
			
			stmt = con.createStatement();
			
			String qry1 = "INSERT INTO MOVIES values ('BAHUBALI','SS RAJAMOULI','PRABHAS','ANUSHKA',2015);";
			stmt.executeUpdate(qry1);
			
			String qry2 = "INSERT INTO MOVIES values ('SULTAN','SHANOO SHARMA','SALMAN KHAN','ANUSHKA SHARMA',2016);";
			stmt.executeUpdate(qry2);
			
			String qry3 = "INSERT INTO MOVIES values ('BAGBHAN','RAVI CHOPRA','AMITABH BACHCHAN','HEMA MALINI',2003);";
			stmt.executeUpdate(qry3);
			
			String qry4 = "INSERT INTO MOVIES values ('DILWALE','ROHIT SHETTY','SHAH RUKH KHAN','KAJOL',2015);";
			stmt.executeUpdate(qry4);
			
			String qry5 = "INSERT INTO MOVIES values ('SINGHAM','ROHIT SHETTY','AJAY DEVGN','KAJAL AGGARWAL',2011);";
			stmt.executeUpdate(qry5);
			
			String qry6 = "INSERT INTO MOVIES values ('CHENNAI EXPRESS','ROHIT SHETTY','SHAH RUKH KHAN','DEEPIKA PADUKONE',2013);";
			stmt.executeUpdate(qry6);
			
			stmt.close();
			
			con.close();
		} 
		catch( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		System.out.println("Data has been inserted successfully!!!!");

	}

}
