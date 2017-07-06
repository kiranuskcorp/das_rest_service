package in.uskcorp.tool.das.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.uskcorp.tool.das.dao.APIDAO;
import in.uskcorp.tool.das.dao.ReportingDAO;
import in.uskcorp.tool.das.domain.Reporting;

@Service("reportingServiceImpl")
public class ReportingServiceImpl extends ReportingService {

	@Autowired
	@Qualifier("reportingDaoImpl")
	ReportingDAO reportingDAO;

	@Override
	protected APIDAO<Reporting> getDao() {
		return reportingDAO;
	}
	
	@Override
	public List<Reporting> getDetails(Integer id,String from, String to){
		return reportingDAO.getDetails(id, from, to);
	}
}
