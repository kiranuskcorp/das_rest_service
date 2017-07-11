package in.uskcorp.tool.das.controller;

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

import in.uskcorp.tool.das.domain.Hospital;
import in.uskcorp.tool.das.service.APIService;
import in.uskcorp.tool.das.service.HospitalService;

@Controller
@RequestMapping(DASRestURIConstants.HOSPITALS)
public class HospitalController extends APIController<Hospital> {

	@Autowired
	@Qualifier("hospitalServiceImpl")
	HospitalService hospitalService;

	@Override
	protected APIService<Hospital> getService() {
		return hospitalService;
	}

	@RequestMapping(value = DASRestURIConstants.READ_ALL_BY_Id, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<Hospital> read(@RequestParam Integer id) {
		try {
			Hospital hospital = getService().read(id);
			return new ResponseEntity<Hospital>(hospital, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Hospital>(HttpStatus.SERVICE_UNAVAILABLE);
		}
	}
}
