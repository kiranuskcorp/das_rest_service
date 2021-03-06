package in.uskcorp.tool.das.dao.mapper;

import in.uskcorp.tool.das.domain.Doctor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DoctorRowMapper implements RowMapper<Doctor> {

	private boolean isReadAll;

	public DoctorRowMapper(boolean isReadAll) {
		this.isReadAll = isReadAll;
	}

	@Override
	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Doctor doctor = new Doctor();
		doctor.setId(rs.getInt("id"));
		doctor.setName(rs.getString("name"));
		doctor.setEmail(rs.getString("email"));
		doctor.setPhone(rs.getString("phone"));
		doctor.setAlternatePhone(rs.getString("alternate_phone"));
		doctor.setDob(rs.getDate("date_of_birth"));
		doctor.setAddress(rs.getString("address"));
		doctor.setGender(rs.getString("gender"));
		doctor.setCreatedDate(rs.getDate("created_date"));
		doctor.setUpdatedDate(rs.getDate("updated_date"));
		doctor.setRating(rs.getFloat("rating"));
		doctor.setExperience(rs.getInt("experience"));
		doctor.setMasterSlot(rs.getString("master_slot"));
		doctor.setDescription(rs.getString("description"));
		doctor.setSpecializationId(rs.getString("specialization_id"));
		doctor.setHospitalId(rs.getInt("hospital_id"));
		doctor.setDepartmentId(rs.getInt("department_id"));

		if (isReadAll) {
			doctor.setDepartmentName(rs.getString("department_name"));
			doctor.setSpecializationName(rs.getString("GROUP_CONCAT(sp.name)"));
			doctor.setHospitalName(rs.getString("hospital_name"));
		}
		return doctor;
	}

}
