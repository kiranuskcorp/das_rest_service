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
		ps.setString(5, doctor.getDepartmentName());
		ps.setString(6, doctor.getSpecializationName());
		ps.setString(7, doctor.getHospitalName());
		ps.setDate(8, ResultSetUtil.converttoSQLDate(new Date()));
		ps.setFloat(9, doctor.getRating());
		ps.setInt(10, doctor.getExperience());
		ps.setInt(11, doctor.getMasterSlot());
		ps.setString(12, doctor.getDescription());
		if (!isInsert) {
			ps.setInt(13, doctor.getId());
		}
	}
}
