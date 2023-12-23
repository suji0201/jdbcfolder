import java.sql.*;
public class student {
	public static void kids()throws Exception{
		String url="jdbc:mysql://localhost:3306/company";
		String username="root";
		String password="2901";
		String query="insert into staff values(?,?,?)";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1,3);
		pst.setString(2, "CPU");
		pst.setString(3, "rectangle");
		pst.executeUpdate();
		con.close();
	}
	public static void main (String[]args)throws Exception{
		kids();
	}

}
