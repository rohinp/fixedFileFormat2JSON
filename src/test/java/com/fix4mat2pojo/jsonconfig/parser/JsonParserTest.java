package com.fix4mat2pojo.jsonconfig.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.Iterator;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.junit.Test;

import com.fix4mat2pojo.utility.LocalProperties;
import com.fix4matpojo.service.JsonNodeObjectCreatorService;

public class JsonParserTest {

	@Test
	public void itShouldREturntheClassNameFromJsonObject()
			throws JsonProcessingException, IOException {
		// setup data
		JsonNodeObjectCreatorService jsonNodeObjectCreatorService = new JsonNodeObjectCreatorService();
		JsonNode jsonNode = jsonNodeObjectCreatorService
				.getJsonNodeObject(LocalProperties.getString("jsonfilepath"));

		// setup - expected
		String expected = "Employee";

		// exercise
		JsonParser jsonParser = new JsonParser(jsonNode);
		String actual = jsonParser.getJSONClassName();

		// verify
		assertEquals(expected, actual);
		System.out.println(actual);
	}
	
	@Test
	public void itShouldREturntheFieldsJsonNodeFromJsonObject()
			throws JsonProcessingException, IOException {
		// setup data
		JsonNodeObjectCreatorService jsonNodeObjectCreatorService = new JsonNodeObjectCreatorService();
		JsonNode jsonNode = jsonNodeObjectCreatorService
				.getJsonNodeObject(LocalProperties.getString("jsonfilepath"));

		// exercise
		JsonParser jsonParser = new JsonParser(jsonNode);
		JsonNode jsonNodeFields = jsonParser.getJSONFields();

		// verify
		assertNotNull(jsonNodeFields);
		Iterator<JsonNode> ite = jsonNodeFields.getElements();
		
		while (ite.hasNext()) {
			JsonNode temp = ite.next();
			Iterator<JsonNode> tempite = temp.getElements();
			while (tempite.hasNext()) {
				System.out.println(tempite.getTextValue());
			}
		}
	}

}
