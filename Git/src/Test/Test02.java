package Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test02 {
	public static void main(String[] args) throws Exception {
		Connection c = DriverManager.getConnection("127.0.0.1", "id", "password");
	}
}
