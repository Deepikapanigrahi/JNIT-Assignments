


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

	public class ResultSet1 {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/hospital";
			String username = "root";
			String password = "3306";
			Connection connection = DriverManager.getConnection(url, username, password);
			
			if(connection!=null)
				System.out.println("Connection established");
			    Statement st=connection.createStatement();
			   ResultSet1 rs= (ResultSet1) st.executeQuery("select * from doctor");
		   while (((ResultSet) rs).next());
		   	System.out.println(((ResultSet) rs).getInt(1));
			 
			    }
		}
	

		
