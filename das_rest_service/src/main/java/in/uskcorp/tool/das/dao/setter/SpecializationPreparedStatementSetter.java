package in.uskcorp.tool.das.dao.setter;

import in.uskcorp.tool.das.domain.Specialization;
import in.uskcorp.tool.das.util.ResultSetUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.PreparedStatementSetter;

public class SpecializationPreparedStatementSetter implements
		PreparedStatementSetter {

	private Specialization specialization;
	private boolean isInsert;

	public SpecializationPreparedStatementSetter(Specialization a,
			boolean isInsert) {
		this.specialization = a;
		this.isInsert = isInsert;
	}

	@Override
	public void setValues(PreparedStatement ps) throws SQLException {

		ps.setString(1, specialization.getSpecializationName());
		ps.setInt(2, specialization.getDepartmentId());
		ps.setDate(3, ResultSetUtil.converttoSQLDate(new Date()));
		ps.setString(4, specialization.getDescription());
		if (!isInsert) {
			ps.setInt(5, specialization.getId());
		}
	}

}
