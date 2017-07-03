package in.uskcorp.tool.das.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.uskcorp.tool.das.dao.APIDAO;
import in.uskcorp.tool.das.dao.HospitalDAO;
import in.uskcorp.tool.das.domain.Hospital;

@Service("hospitalServiceImpl")
public class HospitalServiceImpl extends HospitalService {

	@Autowired
	@Qualifier("hospitalDaoImpl")
	HospitalDAO hospitalDAO;

	@Override
	protected APIDAO<Hospital> getDao() {
		return hospitalDAO;
	}

	@Override
	public List<Hospital> readById(Integer id) {
		return hospitalDAO.readById(id);
	}
}
