package in.uskcorp.tool.das.domain;

public class Login {

	private String username;
	private String password;
	private boolean isValid;

	// private List<Role> role;

	public String getUsername() {
		return username;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + "]";
	}

	/*
	 * public List<Role> getRole() { return role; }
	 * 
	 * public void setRole(List<Role> role) { this.role = role; }
	 */
}
