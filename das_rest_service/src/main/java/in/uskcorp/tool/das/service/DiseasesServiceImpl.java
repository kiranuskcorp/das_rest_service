package in.uskcorp.tool.das.service;

import java.util.List;

import in.uskcorp.tool.das.dao.APIDAO;
import in.uskcorp.tool.das.dao.DiseasesDAO;
import in.uskcorp.tool.das.domain.Diseases;
import in.uskcorp.tool.das.domain.Doctor;
import in.uskcorp.tool.das.domain.Specialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("diseasesServiceImpl")
public class DiseasesServiceImpl extends DiseasesService {

	@Autowired
	@Qualifier("diseasesDAOImpl")
	DiseasesDAO diseasesDAO;

	
	@Override
	protected APIDAO<Diseases> getDao() {
		return diseasesDAO;
	}

	
}
