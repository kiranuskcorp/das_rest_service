package  in.uskcorp.tool.das.service;

import in.uskcorp.tool.das.dao.APIDAO;
import in.uskcorp.tool.das.dao.UserDAO;
import in.uskcorp.tool.das.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl extends UserService {
	@Autowired
	@Qualifier("userDaoImpl")
	UserDAO userDAO;

	@Override
	protected APIDAO<User> getDao() {
		return userDAO;
	}

}
