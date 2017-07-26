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
	public void setValues(PreparedStatement ps) throws SQLException {
		ps.setString(1, user.getName());
		ps.setString(2, user.getEmail());
		ps.setString(3, ResultSetUtil.getGeneratedPassword());
		ps.setString(4, user.getPhone());
		ps.setString(5, user.getAlternatePhone());
		ps.setDate(6, ResultSetUtil.converttoSQLDate(user.getDob()));
		ps.setString(7, user.getGender());
		ps.setString(8, user.getAddress());
		ps.setInt(9, user.getRoleId());
		ps.setInt(10, user.getDepartmentId());
		ps.setInt(11, user.getSpecializationId());
		ps.setInt(12, user.getHospitalId());
		ps.setDate(13, ResultSetUtil.converttoSQLDate(new Date()));
		ps.setFloat(14, user.getRating());
		ps.setInt(15, user.getExperience());
		ps.setString(16, user.getMasterSlot());
		ps.setString(17, user.getDescription());
		if (!isInsert) {
			ps.setInt(18, user.getId());
		}
	}
}
