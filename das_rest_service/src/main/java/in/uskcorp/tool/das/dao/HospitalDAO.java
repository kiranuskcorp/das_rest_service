package in.uskcorp.tool.das.dao;

import java.util.List;

import in.uskcorp.tool.das.domain.Hospital;

public abstract class HospitalDAO extends APIDAO<Hospital> {
	public abstract List<Hospital> readById(Integer id);
}
