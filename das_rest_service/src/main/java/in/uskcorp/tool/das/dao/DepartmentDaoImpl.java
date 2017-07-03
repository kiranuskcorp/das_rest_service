package in.uskcorp.tool.das.dao;

import in.uskcorp.tool.das.dao.mapper.DepartmentRowMapper;
import in.uskcorp.tool.das.dao.setter.DepartmentPreparedStatementSetter;
import in.uskcorp.tool.das.domain.Department;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("departmentDaoImpl")
public class DepartmentDaoImpl extends DepartmentDAO {

	@Override
	protected RowMapper<Department> getRowMapper(Boolean isReadAll) {
		return new DepartmentRowMapper();
	}

	@Override
	protected String getReadAllQuery() {
		return SQLConstants.DEPARTMENT_SELECT;
	}

	@Override
	protected String getReadQuery() {
		return SQLConstants.DEPARTMENT_SELECT_BY_ID;
	}

	@Override
	protected String getInsertQuery() {
		return SQLConstants.DEPARTMENT_INSERT;
	}

	@Override
	protected String getUpdateQuery() {
		return SQLConstants.DEPARTMENT_UPDATE;
	}

	@Override
	protected String getDeleteQuery() {
		return SQLConstants.DEPARTMENT_DELETE;
	}

	@Override
	protected PreparedStatementSetter getPreparedStatementSetter(Department a, boolean isInsert) {
		return new DepartmentPreparedStatementSetter(a, isInsert);
	}
}
