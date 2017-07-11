package in.uskcorp.tool.das.service;

import in.uskcorp.tool.das.dao.APIDAO;
import in.uskcorp.tool.das.dao.RoleDAO;
import in.uskcorp.tool.das.domain.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("roleServiceImpl")
public class RoleServiceImpl extends RoleService {

	@Autowired
	@Qualifier("roleDAOImpl")
	RoleDAO roleDAO;

	@Override
	protected APIDAO<Role> getDao() {
		return roleDAO;
	}

}
