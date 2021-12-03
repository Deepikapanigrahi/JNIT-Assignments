<%@ page import="java.sql.*"%>

<%

Connection con = null;
PreparedStatement ps =null;
Class.forName("com.mysql.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/hospital";
String username="root";
String password="3306";
con = DriverManager.getConnection(url,username,password);
String emp_name = request.getParameter("emp_name");
String emp_pwd = request.getParameter("emp_pwd");
String emp_gender  = request.getParameter("emp_gender");
int emp_age  = Integer.parseInt(request.getParameter("emp_age"));
int emp_phonenbr = Integer.parseInt(request.getParameter("emp_phonenbr"));
PreparedStatement pst1 = con.prepareStatement("select max(emp_id)+1 from employee");
ResultSet rs = pst1.executeQuery();
String emp_id ="" ;
while(rs.next())
{
	emp_id = rs.getString(1);
}
ps =con.prepareStatement("insert into employee values (?,?,?,?,?,?)");
ps.setString(1,emp_id.toString());
ps.setString(2, emp_name);
ps.setString(3, emp_gender);
ps.setInt(4, emp_age);
ps.setString(5, emp_pwd);
ps.setInt(6, emp_phonenbr);
int x = ps.executeUpdate();
if(x!=0)
%>
"<html><body bgcolor='wheat'> <center><h1> <%=emp_name%> Registered Successfully </h1></center></body></html>"