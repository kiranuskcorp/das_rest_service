package in.uskcorp.tool.das.controller;

import in.uskcorp.tool.das.domain.Diseases;
import in.uskcorp.tool.das.domain.Specialization;
import in.uskcorp.tool.das.service.APIService;
import in.uskcorp.tool.das.service.DiseasesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(DASRestURIConstants.DISEASES)
public class DiseasesController extends APIController<Diseases> {

	@Autowired
	@Qualifier("diseasesServiceImpl")
	DiseasesService diseasesService;

	@Override
	protected APIService<Diseases> getService() {
		return diseasesService;
	}

	
	
}
