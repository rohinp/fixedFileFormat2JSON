package com.mytool.avroschema.utility;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ElementPropertiesTest {

	@Test
	public void itShouldGetClassProperties() {
		//given
		
		//when
		List<String> properties = ElementProperties.getClassProperties();
		
		//then
		String property = "";
		Iterator<String> iterator = properties.iterator();
		while (iterator.hasNext()) {
			property = iterator.next();
			System.out.println(property + "=" + ElementProperties.getValue(property));
		}
		assertNotNull(properties);
	}

}
