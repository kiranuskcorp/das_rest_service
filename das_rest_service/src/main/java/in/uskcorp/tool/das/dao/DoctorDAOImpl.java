package in.uskcorp.tool.das.dao;

import in.uskcorp.tool.das.dao.mapper.DoctorRowMapper;
import in.uskcorp.tool.das.dao.mapper.HospitalRowMapper;
import in.uskcorp.tool.das.dao.setter.DoctorPreparedStatementSetter;
import in.uskcorp.tool.das.domain.Doctor;

import java.util.List;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("doctorDaoImpl")
public class DoctorDAOImpl extends DoctorDAO {

	@Override
	protected RowMapper<Doctor> getRowMapper(Boolean b) {
		return new DoctorRowMapper(b);
	}

	@Override
	protected String getReadAllQuery() {
		return SQLConstants.DOCTOR_SELECT;
	}

	@Override
	protected String getReadQuery() {
		return SQLConstants.DOCTOR_SELECT_BY_ID;
	}

	@Override
	protected String getInsertQuery() {
		return SQLConstants.DOCTOR_INSERT;
	}

	@Override
	protected String getUpdateQuery() {
		return SQLConstants.DOCTOR_UPDATE;
	}

	@Override
	protected String getDeleteQuery() {
		return SQLConstants.DOCTOR_DELETE;
	}

	@Override
	protected PreparedStatementSetter getPreparedStatementSetter(Doctor a, boolean isInsert) {
		return new DoctorPreparedStatementSetter(a, isInsert);
	}

	@Override
	public List<Doctor> readById(Integer id) {
		return getJdbcTemplate().query(SQLConstants.DOCTOR_READ_BY_ID, new Object[] { id }, new DoctorRowMapper(false));
	}

}
