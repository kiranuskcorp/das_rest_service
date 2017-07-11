package in.uskcorp.tool.das.controller;

import java.util.ArrayList;
import java.util.List;

import in.uskcorp.tool.das.domain.Login;
import in.uskcorp.tool.das.service.APIService;
import in.uskcorp.tool.das.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(DASRestURIConstants.LOGIN)
public class LoginController extends APIController<Login> {

	@Autowired
	@Qualifier("loginServiceImpl")
	LoginService loginService;

	@Override
	protected APIService<Login> getService() {
		return loginService;
	}

	@RequestMapping(value = DASRestURIConstants.READ_BY_VALUES, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<Login>> readByValues(
			@RequestBody Login loginDetails) {
		try {
			
			Login login = loginService.readByValues(loginDetails.getUsername(),
					loginDetails.getPassword());
			List<Login> loginList = new ArrayList<Login>();
			if(loginList != null)
			loginList.add(login);
			return new ResponseEntity<List<Login>>(loginList, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			List<Login> loginList = new ArrayList<Login>();
			return new ResponseEntity<List<Login>>(loginList,
					HttpStatus.BAD_REQUEST);

		}
	}
}
