package in.uskcorp.tool.das.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import in.uskcorp.tool.das.domain.Login;

import org.springframework.jdbc.core.RowMapper;

public class LoginRowMapper implements RowMapper<Login> {

	@Override
	public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
		Login login = new Login();
		login.setUsername(rs.getString("name"));
		login.setPassword(rs.getString("password"));
		login.setRole(rs.getString("role_name"));
		/*
		 * if (login.isValid()) { login.setValid(rs.getBoolean("true")); }
		 */
		return login;
	}
}
