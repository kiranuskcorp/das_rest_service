package in.uskcorp.tool.das.dao;

import java.util.List;

import in.uskcorp.tool.das.domain.Specialization;

public abstract class SpecializationDAO extends APIDAO<Specialization> {

	public abstract List<Specialization> readById(Integer id);
	// public abstract List<Specialization> readById(Integer id);
}
