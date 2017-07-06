package in.uskcorp.tool.das.service;

import java.util.List;

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

	/*@Override
	public List<Specialization> readById(Integer id) {
		return specializationDAO.readById(id);
	}*/

}
