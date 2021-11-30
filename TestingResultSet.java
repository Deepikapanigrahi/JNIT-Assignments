
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class TestingResultSet {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Statement stmt = null;
		ResultSet rs = null;
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/hospital";
		String username = "root";
		String password = "3306";
		Connection connection = DriverManager.getConnection(url, username, password);
		
		if(connection!=null)
			System.out.println("Connection established");
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from doctor");
		
		  while(rs.next())
		  {
			  String doctorname = rs.getString("doctor_name");
		        int doctorid = rs.getInt("doctor_id");
		        int mobile = rs.getInt("doctor_mobile");
		        String location = rs.getString("doctor_location");
		        //int total = rs.getInt("TOTAL");
		        System.out.println(doctorname + ", " + doctorid + ", " + mobile +
		                           ", " + location );
				  }
		
	}
}


