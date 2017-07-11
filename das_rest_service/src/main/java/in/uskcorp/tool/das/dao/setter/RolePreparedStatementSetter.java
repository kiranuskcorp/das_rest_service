package in.uskcorp.tool.das.dao.setter;

import in.uskcorp.tool.das.domain.Role;
import in.uskcorp.tool.das.domain.Specialization;
import in.uskcorp.tool.das.util.ResultSetUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.PreparedStatementSetter;

public class RolePreparedStatementSetter implements PreparedStatementSetter {

	private Role role;
	private boolean isInsert;

	public RolePreparedStatementSetter(Role a, boolean isInsert) {

		this.role = a;
		this.isInsert = isInsert;
	}

	@Override
	public void setValues(PreparedStatement ps) throws SQLException {

		ps.setString(1, role.getRoleName());
		ps.setDate(2, ResultSetUtil.converttoSQLDate(new Date()));
		ps.setString(3, role.getDescription());
		if (!isInsert) {
			ps.setInt(4, role.getId());
		}
	}

}
