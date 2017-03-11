package cap1.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection(){
		try {
			Connection c = DriverManager.getConnection("caminho","usuario","senha");
			return c;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
