import java.sql.*;
public class updatedata {
	public static void variety()throws Exception{
		String url="jdbc:mysql://localhost:3306/company";
		String username="root";
		String password="2901"; 
		String query="update staff set productvariety='Big' where productid=1";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[]args)throws Exception{
		variety();
	}

}
