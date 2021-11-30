import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/hospital";
		String username = "root";
		String password = "3306";
		Connection connection = DriverManager.getConnection(url, username, password);
		
		if(connection!=null)
			System.out.println("Connection established");
		    java.sql.Statement st=connection.createStatement();
		    int x= st.executeUpdate("insert into doctor values(1027,'Ram','ENT',1234455,'Delhi')");//insert
		    if(x!=0)
		    	System.out.println("Record inserted");
			}

}
