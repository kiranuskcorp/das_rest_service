package in.uskcorp.tool.das.dao.setter;

import in.uskcorp.tool.das.domain.Diseases;
import in.uskcorp.tool.das.util.ResultSetUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.PreparedStatementSetter;

public class DiseasesPreparedStatementSetter implements PreparedStatementSetter {

	private Diseases diseases;
	private boolean isInsert;

	public DiseasesPreparedStatementSetter(Diseases a, boolean isInsert) {
		this.diseases = a;
		this.isInsert = isInsert;
	}

	@Override
	public void setValues(PreparedStatement ps) throws SQLException {
		ps.setString(1, diseases.getName());
		ps.setInt(2, diseases.getDepartmentId());
		// ps.setInt(3, diseases.getSpecializationId());
		ps.setDate(3, ResultSetUtil.converttoSQLDate(new Date()));
		ps.setString(4, diseases.getDescription());
		if (!isInsert) {
			ps.setInt(5, diseases.getId());
		}
	}

}
