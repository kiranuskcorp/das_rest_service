package in.uskcorp.tool.das.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.uskcorp.tool.das.dao.APIDAO;
import in.uskcorp.tool.das.dao.AppointmentDAO;
import in.uskcorp.tool.das.domain.Appointment;

@Service("appointmentServiceImpl")
public class AppointmentServiceImpl extends AppointmentService {

	@Autowired
	@Qualifier("appointmentDaoImpl")
	AppointmentDAO appointmentDAO;

	@Override
	protected APIDAO<Appointment> getDao() {
		return appointmentDAO;
	}

	

}
