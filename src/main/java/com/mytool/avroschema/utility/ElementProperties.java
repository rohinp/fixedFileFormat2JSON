package com.mytool.avroschema.utility;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class ElementProperties {

	private static final String BUNDLE_NAME = "class"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private ElementProperties() {
	}

	public static String getValue(String property) {
		try {
			return RESOURCE_BUNDLE.getString(property);
		} catch (MissingResourceException e) {
			return "";
		}
	}

	public static List<String> getClassProperties() {
		List<String> rList = new ArrayList<String>();
		Enumeration<String> properties = RESOURCE_BUNDLE.getKeys();
		while (properties.hasMoreElements()) {
			rList.add(properties.nextElement());
		}
		return rList;
	}

	public static boolean propertyExists(String key) {
		List<String> keyList = getClassProperties();
		return keyList.contains(key);
	}
}
