package in.uskcorp.tool.das.service;

import in.uskcorp.tool.das.dao.APIDAO;
import in.uskcorp.tool.das.dao.LoginDAO;
import in.uskcorp.tool.das.domain.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("loginServiceImpl")
public class LoginServiceImpl extends LoginService {

	@Autowired
	@Qualifier("loginDaoImpl")
	LoginDAO loginDAO;

	@Override
	protected APIDAO<Login> getDao() {
		// TODO Auto-generated method stub
		return loginDAO;
	}

	@Override
	public Login readByValues(String username, String password) {
		return loginDAO.readByValues(username, password);
	}
}
