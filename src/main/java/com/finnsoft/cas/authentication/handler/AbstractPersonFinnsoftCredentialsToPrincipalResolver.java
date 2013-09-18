/*
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.finnsoft.cas.authentication.handler;

import java.util.HashMap;
import java.util.Map;

import org.jasig.cas.authentication.principal.Credentials;
import org.jasig.cas.authentication.principal.CredentialsToPrincipalResolver;
import org.jasig.cas.authentication.principal.Principal;
import org.jasig.cas.authentication.principal.SimplePrincipal;

import com.finnsoft.cas.authentication.principal.FinnsoftCredential;

/**
 * 
 * @author Scott Battaglia
 * @version $Revision: 1.1 $ $Date: 2012/12/04 19:43:58 $
 * @since 3.1
 *
 */
public abstract class AbstractPersonFinnsoftCredentialsToPrincipalResolver
    implements CredentialsToPrincipalResolver {

    public final Principal resolvePrincipal(final Credentials credentials) {
    	final String principalId = extractPrincipalId(credentials);
    	final FinnsoftCredential fsc = (FinnsoftCredential) credentials;
    	final Map<String, Object> convertedAttributes = new HashMap<String, Object>();
    	convertedAttributes.put("user", fsc.getUser());
    	return new SimplePrincipal(principalId, convertedAttributes);
    }
    
    /**
     * Extracts the id of the user from the provided credentials.
     * 
     * @param credentials the credentials provided by the user.
     * @return the username, or null if it could not be resolved.
     */
    protected abstract String extractPrincipalId(Credentials credentials);
}
