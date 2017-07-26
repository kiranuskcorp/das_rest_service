package in.uskcorp.tool.das.dao;

import in.uskcorp.tool.das.dao.mapper.DiseasesRowMapper;
import in.uskcorp.tool.das.dao.setter.DiseasesPreparedStatementSetter;
import in.uskcorp.tool.das.domain.Diseases;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("diseasesDAOImpl")
public class DiseasesDAOImpl extends DiseasesDAO {

	@Override
	protected RowMapper<Diseases> getRowMapper(Boolean b) {
		return new DiseasesRowMapper(b);
	}

	@Override
	protected String getReadAllQuery() {
		return SQLConstants.DISEASES_SELECT;
	}

	@Override
	protected String getReadQuery() {
		return SQLConstants.DISEASES_SELECT_BY_ID;
	}

	@Override
	protected String getInsertQuery() {
		return SQLConstants.DISEASES_INSERT;
	}

	@Override
	protected String getUpdateQuery() {
		return SQLConstants.DISEASES_UPDATE;
	}

	@Override
	protected String getDeleteQuery() {
		return SQLConstants.DISEASES_DELETE;
	}

	@Override
	protected PreparedStatementSetter getPreparedStatementSetter(Diseases a,
			boolean isInsert) {
		return new DiseasesPreparedStatementSetter(a, isInsert);
	}

}
