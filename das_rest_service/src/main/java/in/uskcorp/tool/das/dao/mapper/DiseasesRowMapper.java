package in.uskcorp.tool.das.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import in.uskcorp.tool.das.domain.Diseases;
import in.uskcorp.tool.das.domain.Specialization;

import org.springframework.jdbc.core.RowMapper;

public class DiseasesRowMapper implements RowMapper<Diseases> {

	private boolean isReadAll;

	public DiseasesRowMapper(boolean isReadAll) {
		this.isReadAll = isReadAll;
	}

	@Override
	public Diseases mapRow(ResultSet rs, int rowNum) throws SQLException {
		Diseases diseases = new Diseases();
		
		diseases.setName(rs.getString("name"));
		diseases.setDepartmentId(rs.getInt("department_id"));
		diseases.setDepartmentName(rs.getString("department_name"));
		// diseases.setSpecializationId(rs.getInt("specialization_id"));
		// diseases.setSpecializationName(rs.getString("specialization_name"));
		diseases.setCreatedDate(rs.getDate("created_date"));
		diseases.setUpdatedDate(rs.getDate("updated_date"));
		diseases.setDescription(rs.getString("description"));
		if(isReadAll){
			diseases.setId(rs.getInt("id"));
		}
		return diseases;

	}

}
