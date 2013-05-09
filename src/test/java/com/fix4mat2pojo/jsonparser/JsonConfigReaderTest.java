package com.fix4mat2pojo.jsonparser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.Iterator;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.junit.Test;

import com.fix4mat2pojo.jsonparser.JsonConfigReader;
import com.fix4mat2pojo.utility.LocalProperties;
import com.fix4matpojo.service.JsonConfigReaderService;

public class JsonConfigReaderTest {

	@Test
	public void itShouldREturntheClassNameFromJsonObject()
			throws JsonProcessingException, IOException {
		// setup data
		JsonConfigReaderService jsonNodeObjectCreatorService = new JsonConfigReaderService();
		JsonConfigReader jsonParser = jsonNodeObjectCreatorService
				.getJsonNodeObject(LocalProperties.getString("jsonfilepath"));

		// setup - expected
		String expected = "Employee";

		// exercise
		String actual = jsonParser.getJSONClassName();

		// verify
		assertEquals(expected, actual);
		System.out.println(actual);
	}
	
	@Test
	public void itShouldREturntheFieldsJsonNodeFromJsonObject()
			throws JsonProcessingException, IOException {
		// setup data
		JsonConfigReaderService jsonNodeObjectCreatorService = new JsonConfigReaderService();
		JsonConfigReader jsonParser = jsonNodeObjectCreatorService
				.getJsonNodeObject(LocalProperties.getString("jsonfilepath"));

		// exercise
		JsonNode jsonNodeFields = jsonParser.getJSONFields();
		
		// verify
		assertNotNull(jsonNodeFields);
		
		JsonNode jsonField = jsonNodeFields.get(0);
		Iterator<JsonNode> ite = jsonField.getElements();
		while (ite.hasNext()) {
			JsonNode temp = ite.next();
			System.out.println(temp.getTextValue());

		}
		
		
	}

}
