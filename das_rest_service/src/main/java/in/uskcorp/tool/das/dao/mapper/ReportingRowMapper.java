package in.uskcorp.tool.das.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.uskcorp.tool.das.domain.Reporting;

public class ReportingRowMapper implements RowMapper<Reporting> {
	private boolean isReadAll;

	public ReportingRowMapper(boolean isReadAll) {
		this.isReadAll = isReadAll;
	}

	@Override
	public Reporting mapRow(ResultSet resultSet, int i) throws SQLException {
		Reporting reporting = new Reporting();
		reporting.setId(resultSet.getInt("id"));
		reporting.setRegistrationId(resultSet.getInt("registration_id"));
		reporting.setAppointmentDate(resultSet.getDate("appointment_date"));
		reporting.setDoctorId(resultSet.getInt("doctor_id"));
		reporting.setPatientName(resultSet.getString("patient_name"));
		reporting.setDob(resultSet.getDate("dob"));
		reporting.setPhoneNumber(resultSet.getString("phone_number"));
		reporting.setHospitalId(resultSet.getInt("hospital_id"));
		reporting.setTime(resultSet.getString("time"));
		reporting.setDiseases(resultSet.getString("diseases"));
		reporting.setEmail(resultSet.getString("email"));
		reporting.setArea(resultSet.getString("area"));
		reporting.setCity(resultSet.getString("city"));
		reporting.setState(resultSet.getString("state"));
		reporting.setPincode(resultSet.getInt("pincode"));
		reporting.setDoctorName(resultSet.getString("doctorName"));
		reporting.setHospitalName(resultSet.getString("hospitalName"));
		return reporting;
	}
}
