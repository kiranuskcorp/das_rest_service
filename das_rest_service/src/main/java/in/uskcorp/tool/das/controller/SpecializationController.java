package in.uskcorp.tool.das.controller;

import in.uskcorp.tool.das.domain.Specialization;
import in.uskcorp.tool.das.service.APIService;
import in.uskcorp.tool.das.service.SpecializationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(DASRestURIConstants.SPECIALIZATIONS)
public class SpecializationController extends APIController<Specialization> {

	@Autowired
	@Qualifier("specializationServiceImpl")
	SpecializationService specializationService;

	@Override
	protected APIService<Specialization> getService() {
		return specializationService;
	}

}
