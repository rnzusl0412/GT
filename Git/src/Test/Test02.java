package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test02 {
	public static void main(String[] args) throws Exception {
		Connection c = DriverManager.getConnection("127.0.0.1", "id", "password");
		Statement stmt = c.createStatement();
		String sql = "SELECT * FROM EMP;";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			System.out.println(rs.getString(1) + "\t" + rs.getString(2));
		}

		rs.close();
		stmt.close();
		c.close();
	}
}
