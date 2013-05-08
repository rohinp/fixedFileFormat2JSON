package com.fix4matpojo.service;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.junit.Test;

import com.fix4mat2pojo.utility.LocalProperties;

public class JsonNodeObjectCreatorServiceTest {

	@Test
	public void itShouldCreateJsonNode() throws JsonProcessingException,
			IOException {
		// setup - data
		String filepath = LocalProperties.getString("jsonfilepath");
		JsonNodeObjectCreatorService jsonNodeObjectCreatorService = new JsonNodeObjectCreatorService();

		// exercise
		JsonNode jsonNode = jsonNodeObjectCreatorService
				.getJsonNodeObject(filepath);

		// verify
		assertNotNull(jsonNode);

		// no teardown needed
	}

}
