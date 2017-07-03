package in.uskcorp.tool.das.service;

import in.uskcorp.tool.das.dao.APIDAO;
import in.uskcorp.tool.das.dao.DepartmentDAO;
import in.uskcorp.tool.das.domain.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("departmentServiceImpl")
public class DepartmentServiceImpl extends DepartmentService {

	@Autowired
	@Qualifier("departmentDaoImpl")
	DepartmentDAO departmentDAO;

	@Override
	protected APIDAO<Department> getDao() {
		return departmentDAO;
	}

}
