package in.uskcorp.tool.das.service;

import java.util.List;

import in.uskcorp.tool.das.domain.Hospital;

public abstract class HospitalService extends APIService<Hospital>{
	public abstract List<Hospital> readById(Integer id);
}
