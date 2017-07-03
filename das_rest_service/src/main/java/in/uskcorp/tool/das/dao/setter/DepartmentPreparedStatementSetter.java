package in.uskcorp.tool.das.dao.setter;

import in.uskcorp.tool.das.domain.Department;
import in.uskcorp.tool.das.util.ResultSetUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.PreparedStatementSetter;

public class DepartmentPreparedStatementSetter implements
		PreparedStatementSetter {
	private Department department;
	private boolean isInsert;

	public DepartmentPreparedStatementSetter(Department a, boolean isInsert) {
		this.department = a;
		this.isInsert = isInsert;
	}

	@Override
	public void setValues(PreparedStatement arg0) throws SQLException {
		arg0.setString(1, department.getDepartmentName());
		arg0.setDate(2, ResultSetUtil.converttoSQLDate(new Date()));
		arg0.setString(3, department.getDescription());
		if (!isInsert) {
			arg0.setInt(4, department.getId());
		}
	}
}