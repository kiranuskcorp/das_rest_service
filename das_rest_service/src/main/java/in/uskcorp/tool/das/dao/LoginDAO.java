package in.uskcorp.tool.das.dao;

import in.uskcorp.tool.das.domain.Login;

public abstract class LoginDAO extends APIDAO<Login>{

	public abstract Login readByValues(String username, String password);
}
