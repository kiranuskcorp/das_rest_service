package in.uskcorp.tool.das.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.uskcorp.tool.das.dao.mapper.ReportingRowMapper;
import in.uskcorp.tool.das.dao.setter.ReportingPreparedStatementSetter;
import in.uskcorp.tool.das.domain.Reporting;

@Repository("reportingDaoImpl")
public class ReportingDAOImpl extends ReportingDAO {

	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	@Override
	protected RowMapper<Reporting> getRowMapper(Boolean b) {
		return new ReportingRowMapper(b);
	}

	@Override
	protected String getReadAllQuery() {
		return SQLConstants.REPORTING_All;
	}

	@Override
	protected String getInsertQuery() {
		return null;
	}

	@Override
	protected String getUpdateQuery() {
		return null;
	}

	@Override
	protected String getDeleteQuery() {
		return null;
	}

	@Override
	protected String getReadQuery() {
		return null;
	}

	@Override
	protected PreparedStatementSetter getPreparedStatementSetter(Reporting a,
			boolean isInsert) {
		return new ReportingPreparedStatementSetter(a, isInsert);
	}

	@Override
	public List<Reporting> getDetails(Integer id, String from, String to) {
		String fromDate, toDate;
		if (from.compareTo(to) > 0) {
			fromDate = to;
			toDate = from;
		} else {
			fromDate = from;
			toDate = to;
		}

		String query = SQLConstants.REPORTING_BY_DOCTOR;
		query += " WHERE h.id = a.hospital_id AND d.id=a.doctor_id AND d.id="
				+ id + " AND a.appointment_date BETWEEN '" + fromDate
				+ "' AND '" + toDate + "'";
		return jdbcTemplate.query(query, getRowMapper(true));
	}
}
