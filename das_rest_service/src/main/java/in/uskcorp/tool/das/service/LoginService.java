package in.uskcorp.tool.das.service;

import in.uskcorp.tool.das.domain.Login;

public abstract class LoginService extends APIService<Login> {

	public abstract Login readByValues(String username, String password);
}
