package facade_pattern_lab9_1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCdemo {
	public static void main(String[] arg) {
		JDBCFacade facade = null;
		try {
			facade = new JDBCFacade();
			String sql = "SELECT * FROM <table> WHERE <column name> = ?";
			facade.setSQL(sql);
			facade.setString(1, "<column value>");
			ResultSet rset = facade.executeQuery();
			if (rset.next()) {
				System.out.println(rset.getString("<column name>"));
			}

			facade.initEnv();
			sql = "{call <stored procedure>( ?, ? )}";
			facade.setSQL(sql, JDBCFacade.CALLABLE);
			facade.setInt(1, 1972);
			facade.registerOutParameter(2, java.sql.Types.INTEGER);
			facade.execute();
			System.out.println(facade.getInt(2));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (facade != null) {
				facade.close();
			}
		}
	}
}
