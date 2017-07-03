package in.uskcorp.tool.das.service;

import in.uskcorp.tool.das.dao.APIDAO;
import in.uskcorp.tool.das.dao.SpecializationDAO;
import in.uskcorp.tool.das.domain.Specialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("specializationServiceImpl")
public class SpecializationServiceImpl extends SpecializationService {

	@Autowired
	@Qualifier("specializationDAOImpl")
	SpecializationDAO specializationDAO;

	@Override
	protected APIDAO<Specialization> getDao() {
		// TODO Auto-generated method stub
		return specializationDAO;
	}

}
