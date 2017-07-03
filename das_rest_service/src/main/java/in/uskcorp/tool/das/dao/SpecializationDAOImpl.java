package in.uskcorp.tool.das.dao;

import in.uskcorp.tool.das.dao.mapper.SpecializationRowMapper;
import in.uskcorp.tool.das.dao.setter.SpecializationPreparedStatementSetter;
import in.uskcorp.tool.das.domain.Specialization;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("specializationDAOImpl")
public class SpecializationDAOImpl extends SpecializationDAO {

	@Override
	protected RowMapper<Specialization> getRowMapper(Boolean b) {
		return new SpecializationRowMapper();
	}

	@Override
	protected String getReadAllQuery() {
		return SQLConstants.SPECIALIZATION_SELECT;
	}

	@Override
	protected String getReadQuery() {
		return SQLConstants.SPECIALIZATION_SELECT_BY_ID;
	}

	@Override
	protected String getInsertQuery() {
		return SQLConstants.SPECIALIZATION_INSERT;
	}

	@Override
	protected String getUpdateQuery() {
		return SQLConstants.SPECIALIZATION_UPDATE;
	}

	@Override
	protected String getDeleteQuery() {
		return SQLConstants.SPECIALIZATION_DELETE;
	}

	@Override
	protected PreparedStatementSetter getPreparedStatementSetter(
			Specialization a, boolean isInsert) {
		return new SpecializationPreparedStatementSetter(a, isInsert);
	}

}