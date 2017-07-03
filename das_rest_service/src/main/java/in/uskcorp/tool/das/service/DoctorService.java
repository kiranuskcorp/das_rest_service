package in.uskcorp.tool.das.service;

import java.util.List;

import in.uskcorp.tool.das.domain.Doctor;

public abstract class DoctorService extends APIService<Doctor> {

	public abstract List<Doctor> readById(Integer id);

}
