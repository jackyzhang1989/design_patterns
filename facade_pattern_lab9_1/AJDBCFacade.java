package facade_pattern_lab9_1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public abstract class AJDBCFacade {
	public static final boolean PREPARED = true;
	public static final boolean CALLABLE = false;

	private Connection conn;
	private PreparedStatement prep;
	private ResultSet rset;

	public AJDBCFacade() throws SQLException {
		initEnv();
	}

	public abstract Connection getConnection() throws SQLException;

	public abstract void freeConnection(Connection conn) throws SQLException;

	public void setInt(int index, int value) throws SQLException {
		prep.setInt(index, value);
	}

	public int getInt(int index) throws SQLException {
		return ((CallableStatement) prep).getInt(index);
	}

	public void setString(int index, String value) throws SQLException {
		prep.setString(index, value);
	}

	public String getString(int index) throws SQLException {
		return ((CallableStatement) prep).getString(index);
	}

	public void registerOutParameter(int index, int type) throws SQLException {
		((CallableStatement) prep).registerOutParameter(index, type);
	}

	public ResultSet executeQuery() throws SQLException {
		rset = prep.executeQuery();
		return (rset);
	}

	public boolean execute() throws SQLException {
		return (prep.execute());
	}

	public void initEnv() {
		freeStatementAndResultSet();
	}
	public void setSQL(String sql) throws SQLException {
		if (conn == null) {
			conn = getConnection();
		}

		prep = conn.prepareStatement(sql);
	}
	public void setSQL(String sql, boolean mode) throws SQLException {
		if (conn == null) {
			conn = getConnection();
		}

		if (mode == PREPARED) {
			prep = conn.prepareStatement(sql);
		} else {
			prep = conn.prepareCall(sql);
		}
	}

	public void freeStatementAndResultSet() {
		if (rset != null) {
			try {
				rset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (prep != null) {
			try {
				prep.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void close() {
		freeStatementAndResultSet();

		if (conn != null) {
			try {
				freeConnection(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
		}
	}
}
