package in.uskcorp.tool.das.dao;

import in.uskcorp.tool.das.dao.mapper.LoginRowMapper;
import in.uskcorp.tool.das.domain.Login;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("loginDaoImpl")
public class LoginDAOImpl extends LoginDAO {

	@Override
	protected RowMapper<Login> getRowMapper(Boolean b) {
		return new LoginRowMapper();
	}

	@Override
	protected String getReadAllQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getReadQuery() {
		return null;
	}

	@Override
	protected String getInsertQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getUpdateQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getDeleteQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected PreparedStatementSetter getPreparedStatementSetter(Login a,
			boolean isInsert) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Login readByValues(String username, String password) {
		Login res = null;
		if (Validate.checkUser(username, password) == true) {
			res = getJdbcTemplate().queryForObject(
					SQLConstants.LOGIN_CREDENTIALS,
					new Object[] { username, password }, getRowMapper(false));
		} else {
			res = null;
		}
		return res;
	}
}
