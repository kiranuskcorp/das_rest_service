package in.uskcorp.tool.das.service;

import in.uskcorp.tool.das.domain.Login;

import org.springframework.security.core.userdetails.UserDetails;

public abstract class LoginService extends APIService<Login> {

	public abstract Login readByValues(String username,String password);
}