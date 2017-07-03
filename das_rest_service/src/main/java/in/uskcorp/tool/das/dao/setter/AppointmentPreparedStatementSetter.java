package in.uskcorp.tool.das.dao.setter;

import in.uskcorp.tool.das.domain.Appointment;
import in.uskcorp.tool.das.util.ResultSetUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.PreparedStatementSetter;

public class AppointmentPreparedStatementSetter implements
		PreparedStatementSetter {
	private Appointment appointment;
	private boolean isInsert;

	public AppointmentPreparedStatementSetter(Appointment a, boolean isInsert) {
		this.appointment = a;
		this.isInsert = isInsert;
	}

	@Override
	public void setValues(PreparedStatement arg0) throws SQLException {

		arg0.setString(1, appointment.getPatientName());
		arg0.setString(2, appointment.getDiseases());
		arg0.setDate(3, ResultSetUtil.converttoSQLDate(appointment
				.getAppointmentDate()));
		arg0.setInt(4, appointment.getDoctorId());
		arg0.setInt(5, appointment.getHospitalId());
		arg0.setString(6, appointment.getPhoneNumber());
		arg0.setInt(7, appointment.getRegistrationId());
		arg0.setDate(8, ResultSetUtil.converttoSQLDate(appointment.getDob()));
		arg0.setString(9, appointment.getTime());
		arg0.setString(10, appointment.getEmail());
		arg0.setString(11, appointment.getArea());
		arg0.setString(12, appointment.getCity());
		arg0.setString(13, appointment.getState());
		arg0.setInt(14, appointment.getPincode());
		arg0.setDate(15, ResultSetUtil.converttoSQLDate(new Date()));
		arg0.setString(16, appointment.getDescription());
		if (!isInsert) {
			arg0.setInt(17, appointment.getId());
		}
	}
}