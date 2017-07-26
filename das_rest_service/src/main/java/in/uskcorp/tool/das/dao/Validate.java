package in.uskcorp.tool.das.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate {
	public static boolean checkUser(String name, String password) {
		boolean st = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/das_tool_db", "root", "");
			PreparedStatement ps = con
					.prepareStatement("select * from user where name=? and password=?");
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			st = rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st;
	}

	public static boolean checkEmail(String email) {
		boolean st = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/das_tool_db", "root", "");
			PreparedStatement preparedStatement = con
					.prepareStatement("select * from user where email= ?");
			preparedStatement.setString(1, email);
			ResultSet rs = preparedStatement.executeQuery();
			st = rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st;
	}
}
