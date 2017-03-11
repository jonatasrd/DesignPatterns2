package cap1.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Programa {

	public static void main(String[] args) throws SQLException {
		Connection c = new ConnectionFactory().getConnection();
		Statement st = c.prepareStatement("select 1 from dual");
	}

}
