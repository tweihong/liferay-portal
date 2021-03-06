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

package com.liferay.portal.authenticator.ldap.configuration;

import aQute.bnd.annotation.metatype.Meta;

/**
 * @author Michael C. Han
 */
@Meta.OCD(
	id = "com.liferay.portal.authenticator.ldap.configuration.LDAPAuthConfiguration",
	localization = "content.Language"
)
public interface LDAPAuthConfiguration {

	@Meta.AD(deflt = "false", required = false)
	public boolean enabled();

	@Meta.AD(
		deflt = "bind", optionValues = {"bind", "password-compare"},
		required = false
	)
	public String method();

	@Meta.AD(
		deflt = "NONE",
		optionValues = {
			"BCRYPT", "MD2", "MD5", "NONE", "SHA", "SHA-256", "SHA-384", "SSHA",
			"UFC-CRYPT"
		},
		required = false
	)
	public String passwordEncryptionAlgorithm();

	@Meta.AD(deflt = "false", required = false)
	public boolean required();

}