package in.uskcorp.tool.das.dao.mapper;

import in.uskcorp.tool.das.domain.User;
import in.uskcorp.tool.das.util.ResultSetUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet resultSet, int i) throws SQLException {
		User user = new User();
		user.setId(resultSet.getInt("id"));
		user.setName(resultSet.getString("name"));
		user.setEmail(resultSet.getString("email"));
		user.setPassword(resultSet.getString("password"));
		user.setConfirmPassword(resultSet.getString("confirm_password"));
		user.setPhone(resultSet.getString("phone"));
		user.setAlternatePhone(resultSet.getString("alternate_phone"));
		user.setDob(ResultSetUtil.getDate(resultSet, "dob"));
		user.setGender(resultSet.getString("gender"));
		user.setAddress(resultSet.getString("address"));
		user.setRole(resultSet.getString("role"));
		user.setCreatedDate(resultSet.getDate("created_date"));
		user.setUpdatedDate(resultSet.getDate("updated_date"));
		user.setDescription(resultSet.getString("description"));
		return user;
	}
}