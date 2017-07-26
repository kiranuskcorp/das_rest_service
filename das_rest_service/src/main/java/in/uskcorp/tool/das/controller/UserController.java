package in.uskcorp.tool.das.controller;

import in.uskcorp.tool.das.domain.User;
import in.uskcorp.tool.das.service.APIService;
import in.uskcorp.tool.das.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(DASRestURIConstants.USERS)
public class UserController extends APIController<User> {
	@Autowired
	@Qualifier("userServiceImpl")
	UserService userService;

	@Override
	protected APIService<User> getService() {
		return userService;
	}

	@RequestMapping(value = "/checkEmail", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody int getDetails(@RequestParam String email) {
		int login = userService.checkEmailExists(email);
		return login;
	}
}
