package in.uskcorp.tool.das.dao;

import in.uskcorp.tool.das.dao.mapper.RoleRowMapper;
import in.uskcorp.tool.das.dao.setter.RolePreparedStatementSetter;
import in.uskcorp.tool.das.domain.Role;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("roleDAOImpl")
public class RoleDAOImpl extends RoleDAO {

	@Override
	protected RowMapper<Role> getRowMapper(Boolean b) {
		return new RoleRowMapper();
	}

	@Override
	protected String getReadAllQuery() {
		return SQLConstants.ROLE_SELECT;
	}

	@Override
	protected String getReadQuery() {
		return SQLConstants.ROLE_SELECT_BY_ID;
	}

	@Override
	protected String getInsertQuery() {
		return SQLConstants.ROLE_INSERT;
	}

	@Override
	protected String getUpdateQuery() {
		return SQLConstants.ROLE_UPDATE;
	}

	@Override
	protected String getDeleteQuery() {
		return SQLConstants.ROLE_DELETE;
	}

	@Override
	protected PreparedStatementSetter getPreparedStatementSetter(Role a,
			boolean isInsert) {
		return new RolePreparedStatementSetter(a, isInsert);
	}

}
