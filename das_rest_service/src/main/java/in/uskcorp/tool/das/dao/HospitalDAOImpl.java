package in.uskcorp.tool.das.dao;

import java.util.List;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.uskcorp.tool.das.dao.mapper.HospitalRowMapper;
import in.uskcorp.tool.das.dao.setter.HospitalPreparedStatementSetter;
import in.uskcorp.tool.das.domain.Hospital;

@Repository("hospitalDaoImpl")
public class HospitalDAOImpl extends HospitalDAO {

	@Override
	protected RowMapper<Hospital> getRowMapper(Boolean b) {
		return new HospitalRowMapper(b);
	}

	@Override
	protected String getReadAllQuery() {
		return SQLConstants.HOSPITAL_SELECT;
	}

	@Override
	protected String getReadQuery() {
		return SQLConstants.HOSPITAL_SELECT_BY_ID;
	}

	@Override
	protected String getInsertQuery() {
		return SQLConstants.HOSPITAL_INSERT;
	}

	@Override
	protected String getUpdateQuery() {
		return SQLConstants.HOSPITAL_UPDATE;
	}

	@Override
	protected String getDeleteQuery() {
		return SQLConstants.HOSPITAL_DELETE;
	}

	@Override
	protected PreparedStatementSetter getPreparedStatementSetter(Hospital a, boolean isInsert) {
		return new HospitalPreparedStatementSetter(a, isInsert);

	}

	@Override
	public List<Hospital> readById(Integer id) {
		return getJdbcTemplate().query(SQLConstants.HOSPITAL_READ_BY_ID, new Object[] { id },
				new HospitalRowMapper(false));
	}
}
