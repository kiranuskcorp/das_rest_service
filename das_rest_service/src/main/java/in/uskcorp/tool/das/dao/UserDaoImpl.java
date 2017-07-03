package in.uskcorp.tool.das.dao;

import in.uskcorp.tool.das.dao.mapper.UserRowMapper;
import in.uskcorp.tool.das.dao.setter.UserPreparedStatementSetter;
import in.uskcorp.tool.das.domain.User;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("userDaoImpl")
public class UserDaoImpl extends UserDAO {

	@Override
	protected RowMapper<User> getRowMapper(Boolean isReadAll) {
		return new UserRowMapper();
	}

	@Override
	protected String getReadAllQuery() {
		return SQLConstants.USER_SELECT;
	}

	@Override
	protected String getReadQuery() {
		return SQLConstants.USER_SELECT_BY_ID;
	}

	@Override
	protected String getInsertQuery() {
		return SQLConstants.USER_INSERT;
	}

	@Override
	protected String getUpdateQuery() {
		return SQLConstants.USER_UPDATE;
	}

	@Override
	protected String getDeleteQuery() {
		return SQLConstants.USER_DELETE;
	}

	@Override
	protected PreparedStatementSetter getPreparedStatementSetter(User a,
			boolean isInsert) {
		return new UserPreparedStatementSetter(a, isInsert);
	}
}
