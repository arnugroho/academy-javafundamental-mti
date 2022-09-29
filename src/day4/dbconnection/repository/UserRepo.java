package day4.dbconnection.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import day4.dbconnection.DatabaseConn;
import day4.dbconnection.model.User;

public class UserRepo implements RepoInterface<User> {

	@Override
	public ArrayList<User> getAll() {
		ArrayList<User> users = new ArrayList<User>();
		try {
			DatabaseConn databaseConn = DatabaseConn.getInstance();
			Statement stmt;

			stmt = databaseConn.getConnection().createStatement();

			// buat query ke database
			String sql = "SELECT * FROM user";

			// eksekusi query dan simpan hasilnya di obj ResultSet
			ResultSet rs = stmt.executeQuery(sql);

			// tampilkan hasil query
			while (rs.next()) {
				User user = new User();
				user.setIdUser(rs.getInt("iduser"));
				user.setNama(rs.getString("nama"));
				user.setAlamat(rs.getString("alamat"));

				users.add(user);
			}

			stmt.close();
			databaseConn.closeConnection();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public void insert(User obj) {
		try {
			DatabaseConn databaseConn = DatabaseConn.getInstance();
			Statement stmt = databaseConn.getConnection().createStatement();

			// buat query ke database
			String sql = "INSERT INTO user (iduser, nama, alamat) VALUES(?,?,?)";

			PreparedStatement ps = databaseConn.getConnection().prepareStatement(sql);
			ps.setInt(1, obj.getIdUser());
			ps.setString(2, obj.getNama());
			ps.setString(3, obj.getAlamat());
			// simpan
			ps.executeUpdate();

			stmt.close();
			databaseConn.closeConnection();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
