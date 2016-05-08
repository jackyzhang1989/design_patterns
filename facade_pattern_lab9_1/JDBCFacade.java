package facade_pattern_lab9_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCFacade extends AJDBCFacade {
	static {
		try {
			Class.forName("<driver>").newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public JDBCFacade() throws SQLException {
		super();
	}

	public Connection getConnection() throws SQLException {
		return (DriverManager.getConnection("<database>"));
	}

	public void freeConnection(Connection conn) throws SQLException {
		conn.close();
	}


}
