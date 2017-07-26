package in.uskcorp.tool.das.service;

import in.uskcorp.tool.das.domain.User;

public abstract class UserService extends APIService<User> {

	public abstract int checkEmailExists(String email);
}
