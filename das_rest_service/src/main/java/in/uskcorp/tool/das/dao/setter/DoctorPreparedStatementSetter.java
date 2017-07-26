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
		ps.setString(3, ResultSetUtil.getGeneratedPassword());
		ps.setString(4, doctor.getPhone());
		ps.setString(5, doctor.getAlternatePhone());
		ps.setDate(6, ResultSetUtil.converttoSQLDate(doctor.getDob()));
		ps.setString(7, doctor.getGender());
		ps.setString(8, doctor.getAddress());
		ps.setInt(9, doctor.getRoleId());
		ps.setInt(10, doctor.getDepartmentId());
		ps.setString(11,
				doctor.getSpecializationId().replace("[", "").replace("]", "")
						.replace("\"", ""));
		ps.setInt(12, doctor.getHospitalId());
		ps.setDate(13, ResultSetUtil.converttoSQLDate(new Date()));
		ps.setFloat(14, doctor.getRating());
		ps.setInt(15, doctor.getExperience());
		ps.setString(16, doctor.getMasterSlot());
		ps.setString(17, doctor.getDescription());
		if (!isInsert) {
			ps.setInt(18, doctor.getId());
		}
	}
}
