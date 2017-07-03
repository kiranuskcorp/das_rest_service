package in.uskcorp.tool.das.controller;

import in.uskcorp.tool.das.domain.Department;
import in.uskcorp.tool.das.service.APIService;
import in.uskcorp.tool.das.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(DASRestURIConstants.DEPARTMENTS)
public class DepartmentController extends APIController<Department> {
	@Autowired
	@Qualifier("departmentServiceImpl")
	DepartmentService departmentService;

	@Override
	protected APIService<Department> getService() {
		return departmentService;
	}
}
