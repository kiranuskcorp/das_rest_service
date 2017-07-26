package in.uskcorp.tool.das.dao.mapper;

import in.uskcorp.tool.das.domain.Hospital;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class HospitalRowMapper implements RowMapper<Hospital> {

	private boolean isReadAll;

	public HospitalRowMapper(boolean isReadAll) {
		super();
		this.isReadAll = isReadAll;
	}

	@Override
	public Hospital mapRow(ResultSet rs, int rowNum) throws SQLException {
		Hospital hospital = new Hospital();
		hospital.setId(rs.getInt("id"));
		hospital.setName(rs.getString("name"));
		hospital.setArea(rs.getString("area"));
		hospital.setContact(rs.getString("contact"));
		hospital.setDistrict(rs.getString("district"));
		hospital.setAvailableFacilities(rs.getString("available_facilities"));
		hospital.setHospitalEstablishmentDate(rs
				.getDate("hospital_establishment_date"));
		hospital.setHospitalRegistrationNumber(rs
				.getString("hospital_registration_number"));
		hospital.setStartTime(rs.getString("start_time"));
		hospital.setEndTime(rs.getString("end_time"));
		// System.out.println("DepName:: " + rs.getString("department_id"));
		hospital.setDepartmentId(rs.getString("department_id"));
		hospital.setState(rs.getString("state"));
		hospital.setCreatedDate(rs.getDate("created_date"));
		hospital.setUpdatedDate(rs.getDate("updated_date"));
		hospital.setDescription(rs.getString("description"));
		if (isReadAll) {
			hospital.setDepartmentName(rs.getString("GROUP_CONCAT(dp.department_name)"));
			// System.out.println(rs.getString("department_name"));
		}
		return hospital;
	}
	
}
