package in.uskcorp.tool.das.controller;

import in.uskcorp.tool.das.domain.Appointment;
import in.uskcorp.tool.das.service.APIService;
import in.uskcorp.tool.das.service.AppointmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
