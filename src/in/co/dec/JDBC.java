package in.co.dec;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "Vikky@333");
			System.out.println("connected");
		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
