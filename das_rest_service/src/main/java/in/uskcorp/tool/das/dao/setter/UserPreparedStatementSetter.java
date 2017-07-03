package in.uskcorp.tool.das.dao.setter;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.PreparedStatementSetter;

import in.uskcorp.tool.das.domain.User;
import in.uskcorp.tool.das.util.ResultSetUtil;

public class UserPreparedStatementSetter implements PreparedStatementSetter {
	private User user;
	private boolean isInsert;

	public UserPreparedStatementSetter(User a, boolean isInsert) {
		this.user = a;
		this.isInsert = isInsert;
	}

	@Override
	public void setValues(PreparedStatement arg0) throws SQLException {
		arg0.setString(1, user.getName());
		arg0.setString(2, user.getEmail());
		arg0.setString(3, user.getPassword());
		arg0.setString(4, user.getConfirmPassword());
		arg0.setString(5, user.getPhone());
		arg0.setString(6, user.getAlternatePhone());
		arg0.setDate(7, ResultSetUtil.converttoSQLDate(user.getDob()));
		arg0.setString(8, user.getGender());
		arg0.setString(9, user.getAddress());
		arg0.setString(10, user.getRole());
		arg0.setDate(11, ResultSetUtil.converttoSQLDate(new Date()));
		arg0.setString(12, user.getDescription());
		if (!isInsert) {
			arg0.setInt(13, user.getId());
		}
	}
}
