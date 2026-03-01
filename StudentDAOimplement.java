package co.in;
import java.sql.*;

public class StudentDAOimplement implements StudentDao {
	private String url = "jdbc:mysql://localhost:3306/studentJDBCDB";
	private String username = "root";
	private String password = "Priyadarshini!1";
	
	public void addStudent(Student s) {
		try {
			Connection conn = DriverManager.getConnection(url,username,password);
			
			String sql = "insert into student(id,name,marks) values (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1,s.getId());
			ps.setString(2,s.getName());
			ps.setInt(3,s.getMarks());
			
			ps.executeUpdate();
			
			System.out.println("Student inserted successfully");
			
			ps.close();
			conn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
