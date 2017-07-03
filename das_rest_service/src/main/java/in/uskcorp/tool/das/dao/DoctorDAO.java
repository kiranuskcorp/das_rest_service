package in.uskcorp.tool.das.dao;

import java.util.List;

import in.uskcorp.tool.das.domain.Doctor;

public abstract class DoctorDAO extends APIDAO<Doctor> {

	public abstract List<Doctor> readById(Integer id);
}
