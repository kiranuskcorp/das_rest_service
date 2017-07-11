package in.uskcorp.tool.das.dao.setter;

import in.uskcorp.tool.das.domain.Doctor;
import in.uskcorp.tool.das.util.ResultSetUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.PreparedStatementSetter;

public class DoctorPreparedStatementSetter implements PreparedStatementSetter {

	private Doctor doctor;
	private boolean isInsert;

	public DoctorPreparedStatementSetter(Doctor doctor, boolean isInsert) {
		super();
		this.doctor = doctor;
		this.isInsert = isInsert;
	}

	@Override
	public void setValues(PreparedStatement ps) throws SQLException {

		ps.setString(1, doctor.getName());
		ps.setString(2, doctor.getEmail());
		ps.setString(3, doctor.getPhone());
		ps.setString(4, doctor.getAlternatePhone());
		ps.setDate(5, ResultSetUtil.converttoSQLDate(doctor.getDob()));
		ps.setString(6, doctor.getGender());
		ps.setInt(7, doctor.getDepartmentId());
		ps.setInt(8, doctor.getSpecializationId());
		ps.setInt(9, doctor.getHospitalId());
		ps.setDate(10, ResultSetUtil.converttoSQLDate(new Date()));
		ps.setFloat(11, doctor.getRating());
		ps.setInt(12, doctor.getExperience());
		ps.setInt(13, doctor.getMasterSlot());
		ps.setString(14, doctor.getDescription());
		if (!isInsert) {
			ps.setInt(15, doctor.getId());
		}
	}
}
