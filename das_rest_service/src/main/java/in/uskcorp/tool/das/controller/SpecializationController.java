package in.uskcorp.tool.das.controller;

import java.util.List;

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

import in.uskcorp.tool.das.domain.Specialization;
import in.uskcorp.tool.das.service.APIService;
import in.uskcorp.tool.das.service.SpecializationService;

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

	@RequestMapping(value = DASRestURIConstants.READ_ALL_BY_ID, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<Specialization>> readById(@RequestParam Integer id) {
		try {
			List<Specialization> specializations = specializationService.readById(id);
			return new ResponseEntity<List<Specialization>>(specializations, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<Specialization>>(HttpStatus.SERVICE_UNAVAILABLE);
		}
	}
}/*
	 * @RequestMapping(value = DASRestURIConstants.READ_ALL_BY_ID, method =
	 * RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 * public @ResponseBody ResponseEntity<List<Specialization>> readById(
	 * 
	 * @RequestParam Integer id) { try { List<Specialization> specialization =
	 * specializationService .readById(id); return new
	 * ResponseEntity<List<Specialization>>(specialization, HttpStatus.OK); }
	 * catch (Exception e) { e.printStackTrace(); return new
	 * ResponseEntity<List<Specialization>>( HttpStatus.SERVICE_UNAVAILABLE); }
	 * }
	 */
