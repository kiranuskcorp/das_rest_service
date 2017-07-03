package in.uskcorp.tool.das.controller;

import in.uskcorp.tool.das.domain.Appointment;
import in.uskcorp.tool.das.service.APIService;
import in.uskcorp.tool.das.service.AppointmentService;

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
@RequestMapping(DASRestURIConstants.APPOINTMENTS)
public class AppointmentController extends APIController<Appointment> {
	@Autowired
	@Qualifier("appointmentServiceImpl")
	AppointmentService appointmentService;

	@Override
	protected APIService<Appointment> getService() {
		return appointmentService;
	}

	
}
