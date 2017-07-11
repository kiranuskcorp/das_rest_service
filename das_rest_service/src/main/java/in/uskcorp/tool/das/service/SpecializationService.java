package in.uskcorp.tool.das.service;

import java.util.List;

import in.uskcorp.tool.das.domain.Specialization;

public abstract class SpecializationService extends APIService<Specialization>{

	public abstract List<Specialization> readById(Integer id);
}
