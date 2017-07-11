package in.uskcorp.tool.das.controller;

import in.uskcorp.tool.das.domain.Role;
import in.uskcorp.tool.das.service.APIService;
import in.uskcorp.tool.das.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(DASRestURIConstants.ROLES)
public class RoleController extends APIController<Role>{

	@Autowired
	@Qualifier("roleServiceImpl")
	RoleService roleService;

	@Override
	protected APIService<Role> getService() {
		return roleService;
	}
}
