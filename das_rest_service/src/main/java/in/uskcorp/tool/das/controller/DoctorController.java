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

import in.uskcorp.tool.das.domain.Doctor;
import in.uskcorp.tool.das.service.APIService;
import in.uskcorp.tool.das.service.DoctorService;

@Controller
@RequestMapping(DASRestURIConstants.DOCTORS)
public class DoctorController extends APIController<Doctor> {

	@Autowired
	@Qualifier("doctorServiceImpl")
	DoctorService doctorService;

	@Override
	protected APIService<Doctor> getService() {
		// TODO Auto-generated method stub
		return doctorService;
	}

	@RequestMapping(value = DASRestURIConstants.READ_ALL_BY_ID, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<Doctor>> readById(@RequestParam Integer id) {
		try {
			List<Doctor> doctor = doctorService.readById(id);
			return new ResponseEntity<List<Doctor>>(doctor, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<Doctor>>(HttpStatus.SERVICE_UNAVAILABLE);
		}
	}
}
