package in.uskcorp.tool.das.service;

import in.uskcorp.tool.das.dao.APIDAO;
import in.uskcorp.tool.das.dao.UserDAO;
import in.uskcorp.tool.das.dao.Validate;
import in.uskcorp.tool.das.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	@Override
	public User createUser(User user) {
		String email = user.getEmail();
		Validate validate = new Validate();
		if (validate.checkEmail(user.getEmail()) == false) {
			userDAO.create(user);
			System.out.println(user.getEmail() + "email value");
		} else {
			System.out.println("duplicate email");
			return null;
		}
		return user;
	}

}
