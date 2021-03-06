package in.uskcorp.tool.das.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.uskcorp.tool.das.domain.Specialization;

public class SpecializationRowMapper implements RowMapper<Specialization> {

	private boolean isReadAll;

	public SpecializationRowMapper(boolean isReadAll) {
		super();
		this.isReadAll = isReadAll;
	}

	@Override
	public Specialization mapRow(ResultSet rs, int rowNum) throws SQLException {
		Specialization specialization = new Specialization();
		specialization.setId(rs.getInt("id"));
		specialization.setSpecializationName(rs.getString("name"));
		specialization.setDepartmentId(rs.getInt("department_Id"));
		specialization.setCreatedDate(rs.getDate("created_date"));
		specialization.setUpdatedDate(rs.getDate("updated_date"));
		specialization.setDescription(rs.getString("description"));
		specialization.setActiveFlag(rs.getInt("active_flag"));

		if (isReadAll) {
			specialization.setId(rs.getInt("id"));
			specialization.setDepartmentName(rs.getString("department_name"));
		}
		return specialization;
	}

}
