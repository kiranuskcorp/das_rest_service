package in.uskcorp.tool.das.dao;

import java.util.List;

import in.uskcorp.tool.das.domain.Reporting;

public abstract class ReportingDAO extends APIDAO<Reporting> {

	public abstract List<Reporting> getDetails(Integer id, String from, String to);
}
