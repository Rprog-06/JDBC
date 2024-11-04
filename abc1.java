package abc;
import java.sql.*;
public class abc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ab", "new_user","Pass@123");
			Statement stmt=con.createStatement();
			PreparedStatement ps=null;
			
			ResultSet rs=stmt.executeQuery("select * from student");
						
			
			String str="insert into student values(102,'bbb')";
			ps=con.prepareStatement(str);
			ps.execute();
			String str1="delete from student where roll=103";
			ps=con.prepareStatement(str1);
			ps.execute();
			while(rs.next())
			{
				int Roll=rs.getInt("roll");
				String Name =rs.getString("name");
				System.out.print(Roll+ " "  +Name+  "");
			}
			
			
			
		} catch(Exception e) {}
	}

}
