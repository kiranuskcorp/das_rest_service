package in.uskcorp.tool.das.dao;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.uskcorp.tool.das.dao.mapper.AppointmentRowMapper;
import in.uskcorp.tool.das.dao.setter.AppointmentPreparedStatementSetter;
import in.uskcorp.tool.das.domain.Appointment;

@Repository("appointmentDaoImpl")
public class AppointmentDaoImpl extends AppointmentDAO {

	@Override
	protected RowMapper<Appointment> getRowMapper(Boolean isReadAll) {
		return new AppointmentRowMapper(isReadAll);
	}

	@Override
	protected String getReadAllQuery() {
		return SQLConstants.APPOINTMENT_SELECT;
	}

	@Override
	protected String getReadQuery() {
		return SQLConstants.APPOINTMENT_SELECT_BY_ID;
	}

	@Override
	protected String getInsertQuery() {
		return SQLConstants.APPOINTMENT_INSERT;
	}

	@Override
	protected String getUpdateQuery() {
		return SQLConstants.APPOINTMENT_UPDATE;
	}

	@Override
	protected String getDeleteQuery() {
		return SQLConstants.APPOINTMENT_DELETE;
	}

	@Override
	protected PreparedStatementSetter getPreparedStatementSetter(Appointment a, boolean isInsert) {
		return new AppointmentPreparedStatementSetter(a, isInsert);
	}

}
