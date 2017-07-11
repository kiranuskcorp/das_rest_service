package in.uskcorp.tool.das.service;

import java.util.List;

import in.uskcorp.tool.das.domain.Reporting;

public abstract class ReportingService extends APIService<Reporting> {
	public abstract List<Reporting> getDetails(Integer id, String from, String to);
}
