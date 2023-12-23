import java.sql.*;
public class getdata {
	public static void employee()throws Exception{
		String url="jdbc:mysql://localhost:3306/company";
		String username="root";
		String password="2901";
		String query="Select*from staff";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement pst=con.createStatement();
		ResultSet rs=pst.executeQuery(query);
		while(rs.next()) {
			System.out.println("productid"+rs.getInt(1));
			System.out.println("productname"+rs.getString(2));
			System.out.println("productvariety"+rs.getString(3));
		}
		con.close();
	}
	public static void main(String[]args)throws Exception{
		employee();
	}

}

