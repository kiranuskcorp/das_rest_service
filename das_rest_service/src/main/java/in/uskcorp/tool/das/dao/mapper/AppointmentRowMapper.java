package in.uskcorp.tool.das.dao.mapper;

import in.uskcorp.tool.das.domain.Appointment;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AppointmentRowMapper implements RowMapper<Appointment> {

	private boolean isReadAll;

	public AppointmentRowMapper(boolean isReadAll) {
		this.isReadAll = isReadAll;
	}

	@Override
	public Appointment mapRow(ResultSet resultSet, int i) throws SQLException {
		Appointment appointment = new Appointment();
		appointment.setId(resultSet.getInt("id"));
		appointment.setPatientName(resultSet.getString("patient_name"));
		appointment.setDiseases(resultSet.getString("diseases_name"));
		appointment.setDiseasesId(resultSet.getInt("diseases"));
		appointment.setAppointmentDate(resultSet.getDate("appointment_date"));
		appointment.setDoctorId(resultSet.getInt("doctor_id"));
		appointment.setHospitalId(resultSet.getInt("hospital_id"));
		appointment.setPhoneNumber(resultSet.getString("phone_number"));
		appointment.setRegistrationId(resultSet.getInt("registration_id"));
		appointment.setDob(resultSet.getDate("dob"));
		appointment.setTime(resultSet.getString("time"));
		appointment.setEmail(resultSet.getString("email"));
		appointment.setArea(resultSet.getString("area"));
		appointment.setCity(resultSet.getString("city"));
		appointment.setState(resultSet.getString("state"));
		appointment.setPincode(resultSet.getInt("pincode"));
		appointment.setCreatedDate(resultSet.getDate("created_date"));
		appointment.setUpdatedDate(resultSet.getDate("updated_date"));
		appointment.setDescription(resultSet.getString("description"));
		appointment.setDoctorName(resultSet.getString("doctorName"));
		appointment.setHospitalName(resultSet.getString("hospitalName"));
		return appointment;
	}
}
