package in.uskcorp.tool.das.dao;

import in.uskcorp.tool.das.domain.User;

public abstract class UserDAO extends APIDAO<User> {

	public abstract int checkEmailExists(String email);

}
