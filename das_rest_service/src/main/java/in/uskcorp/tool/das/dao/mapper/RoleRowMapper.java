package in.uskcorp.tool.das.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import in.uskcorp.tool.das.domain.Role;

import org.springframework.jdbc.core.RowMapper;

public class RoleRowMapper implements RowMapper<Role> {

	@Override
	public Role mapRow(ResultSet rs, int rowNum) throws SQLException {
		Role role = new Role();
		role.setId(rs.getInt("id"));
		role.setRoleName(rs.getString("role_name"));
		role.setCreatedDate(rs.getDate("created_date"));
		role.setUpdatedDate(rs.getDate("updated_date"));
		role.setDescription(rs.getString("description"));

		return role;
	}

}
