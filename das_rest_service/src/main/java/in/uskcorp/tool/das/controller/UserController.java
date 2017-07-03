package in.uskcorp.tool.das.controller;

import in.uskcorp.tool.das.domain.User;
import in.uskcorp.tool.das.service.APIService;
import in.uskcorp.tool.das.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
