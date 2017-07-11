package in.uskcorp.tool.das.dao.setter;

import in.uskcorp.tool.das.domain.Hospital;
import in.uskcorp.tool.das.util.ResultSetUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.PreparedStatementSetter;

public class HospitalPreparedStatementSetter implements PreparedStatementSetter {

	private Hospital hospital;
	private boolean isInsert;

	public HospitalPreparedStatementSetter(Hospital a, boolean isInsert) {
		this.hospital = a;
		this.isInsert = isInsert;
	}

	@Override
	public void setValues(PreparedStatement ps) throws SQLException {
		ps.setString(1, hospital.getName());
		ps.setString(2, hospital.getAvailableFacilities().replace("[", "").replace("]", "").replace("\"", ""));
		ps.setInt(3, hospital.getDepartmentId());
		ps.setString(4, hospital.getHospitalRegistrationNumber());
		ps.setDate(5, ResultSetUtil.converttoSQLDate(hospital.getHospitalEstablishmentDate()));
		ps.setString(6, hospital.getStartTime());
		ps.setString(7, hospital.getEndTime());
		ps.setString(8, hospital.getContact());
		ps.setString(9, hospital.getArea());
		ps.setString(10, hospital.getDistrict());
		ps.setString(11, hospital.getState());
		ps.setDate(12, ResultSetUtil.converttoSQLDate(new Date()));
		ps.setString(13, hospital.getDescription());

		if (!isInsert) {
			ps.setInt(14, hospital.getId());
		}
	}

}
