/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.search.solr.http;

import org.apache.http.conn.ssl.SSLSocketFactory;

/**
 * @author Michael C. Han
 */
public interface SSLSocketFactoryBuilder {

	public SSLSocketFactory build() throws Exception;

	public void setKeyStorePassword(char[] keyStorePassword);

	public void setKeyStorePath(String keyStorePath);

	public void setKeyStoreType(String keyStoreType);

	public void setTrustStorePassword(char[] trustStorePassword);

	public void setTrustStorePath(String trustStoreLocation);

	public void setTrustStoreType(String trustStoreType);

	public void setVerifyServerCertificate(boolean verifyServerCertificate);

	public void setVerifyServerHostname(boolean verifyServerHostname);

}