package JDBC_;

import java.sql.*;                                          // 1st step

public class BASIC_STEPS 
{
	
	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/jdbc";
		String uname="root";
		String pass="7032248200@Aa";
		
		String query="select name from student where id =2;";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");                                  //2nd step loading drivers nd register
		Connection con=DriverManager.getConnection(url,uname,pass);					//3rd create connection	//forname responsible for load
	
		Statement st=con.createStatement();                                         //4th create stmt
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name =rs.getString("name");
		
		System.out.println(name);
		
		st.close();
		con.close();
	}

}
