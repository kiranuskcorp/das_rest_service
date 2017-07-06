package in.uskcorp.tool.das.dao.setter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

import in.uskcorp.tool.das.domain.Reporting;
import in.uskcorp.tool.das.util.ResultSetUtil;

public class ReportingPreparedStatementSetter implements PreparedStatementSetter {

	private Reporting reporting;
	private boolean isInsert;

	public ReportingPreparedStatementSetter(Reporting reporting, boolean isInsert) {
		super();
		this.reporting = reporting;
		this.isInsert = isInsert;
	}

	@Override
	public void setValues(PreparedStatement ps) throws SQLException {
		ps.setDate(1, ResultSetUtil.converttoSQLDate(reporting.getFromDate()));
		ps.setDate(2, ResultSetUtil.converttoSQLDate(reporting.getToDate()));
		ps.setInt(3, reporting.getDoctorId());
	}
}
