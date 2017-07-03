package in.uskcorp.tool.das.service;

import in.uskcorp.tool.das.dao.APIDAO;
import in.uskcorp.tool.das.dao.DoctorDAO;
import in.uskcorp.tool.das.domain.Doctor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("doctorServiceImpl")
public class DoctorServiceImpl extends DoctorService {

	@Autowired
	@Qualifier("doctorDaoImpl")
	DoctorDAO doctorDAO;

	@Override
	protected APIDAO<Doctor> getDao() {
		// TODO Auto-generated method stub
		return doctorDAO;
	}

	@Override
	public List<Doctor> readById(Integer id) {
		return doctorDAO.readById(id);
	}

}
