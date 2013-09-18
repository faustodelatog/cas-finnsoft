package com.finnsoft.cas.authentication.handler;

import org.jasig.cas.authentication.handler.AuthenticationException;

import com.finnsoft.cas.authentication.principal.FinnsoftCredential;

public class FinnsoftAuthenticationHandler extends
		AbstractFinnsoftAuthenticationHandler {

	public boolean authenticateFinnsoft(FinnsoftCredential credentials)
			throws AuthenticationException {
		System.out.println("HOLA::::: " + credentials.getUsername() + " " + credentials.getPassword());
		credentials.setUser(credentials.getUsername());
		return true;
	}

}