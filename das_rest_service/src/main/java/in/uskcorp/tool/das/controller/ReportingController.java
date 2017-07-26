package in.uskcorp.tool.das.controller;

import in.uskcorp.tool.das.domain.Reporting;
import in.uskcorp.tool.das.service.APIService;
import in.uskcorp.tool.das.service.ReportingService;

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

@Controller
@RequestMapping(DASRestURIConstants.REPORTINGS)
public class ReportingController extends APIController<Reporting> {

	@Autowired
	@Qualifier("reportingServiceImpl")
	ReportingService reportingService;

	@Override
	protected APIService<Reporting> getService() {
		return reportingService;
	}

	@RequestMapping(value = "/getReportingDetails", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<Reporting>> getDetails(
			@RequestParam Integer id, @RequestParam String from,
			@RequestParam String to) {
		System.out.println(id + "---" + from + "-----" + to);
		try {
			List<Reporting> reporting = ((ReportingService) getService())
					.getDetails(id, from, to);
			return new ResponseEntity<List<Reporting>>(reporting, HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<Reporting>>(
					HttpStatus.SERVICE_UNAVAILABLE);
		}
	}
}
