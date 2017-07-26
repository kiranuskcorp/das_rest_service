package in.uskcorp.tool.das.controller;

import in.uskcorp.tool.das.domain.User;
import in.uskcorp.tool.das.service.APIService;
import in.uskcorp.tool.das.service.UserService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping(value = DASRestURIConstants.CREATE, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<String> create(@RequestBody User user) {
		try {
			User userCreate = userService.createUser(user);
			return new ResponseEntity<String>(userCreate, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(HttpStatus.SERVICE_UNAVAILABLE);
		}
	}
}
