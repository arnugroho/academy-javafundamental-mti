package day4.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConn {
	private static DatabaseConn dbObject;
	private Connection connection;

	// class tidak bisa dibuat dari luar
	private DatabaseConn() {
	}

	public static DatabaseConn getInstance() {

		// create object if it's not already created
		if (dbObject == null) {
			try {
				Class.forName(JdbcParameter.JDBC_DRIVER);
				dbObject = new DatabaseConn();
			} catch (ClassNotFoundException e) {
				System.out.println("Class Library JDBC belum ada " + e);
			}
		}
		dbObject.openConnection();

		// returns the singleton object
		return dbObject;
	}

	public Connection getConnection() {
		return this.connection;
	}

	public void closeConnection() {
		try {
			if (this.connection != null) {
				this.connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void openConnection() {
		try {
			if (dbObject.connection == null || dbObject.connection.isClosed()) {
				dbObject.connection = DriverManager.getConnection(JdbcParameter.DB_URL, JdbcParameter.USER,
						JdbcParameter.PASS);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
