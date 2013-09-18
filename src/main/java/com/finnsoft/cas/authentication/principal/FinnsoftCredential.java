package com.finnsoft.cas.authentication.principal;

import org.jasig.cas.authentication.principal.Credentials;

public class FinnsoftCredential implements Credentials {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8289697358299713589L;

	private String username;
	private String password;
	private String user;
	
	public String getUsername() {
		return username;
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
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

	

}
