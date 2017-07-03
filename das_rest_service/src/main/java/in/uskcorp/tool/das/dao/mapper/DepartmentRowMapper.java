package in.uskcorp.tool.das.dao.mapper;

import in.uskcorp.tool.das.domain.Department;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DepartmentRowMapper implements RowMapper<Department> {

	@Override
	public Department mapRow(ResultSet resultSet, int i) throws SQLException {
		Department department = new Department();
		department.setId(resultSet.getInt("id"));
		department.setDepartmentName(resultSet.getString("department_name"));
		department.setCreatedDate(resultSet.getDate("created_date"));
		department.setUpdatedDate(resultSet.getDate("updated_date"));
		department.setDescription(resultSet.getString("description"));
		return department;
	}

}
