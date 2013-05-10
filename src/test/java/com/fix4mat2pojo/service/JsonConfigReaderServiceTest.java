package com.fix4mat2pojo.service;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.junit.Test;

import com.fix4mat2pojo.jsonparser.JsonConfigReader;
import com.fix4mat2pojo.service.JsonConfigReaderService;
import com.fix4mat2pojo.utility.LocalProperties;

public class JsonConfigReaderServiceTest {

	@Test
	public void itShouldCreateJsonNode() throws JsonProcessingException,
			IOException {
		// setup - data
		String filepath = LocalProperties.getString("jsonfilepath");
		JsonConfigReaderService jsonNodeObjectCreatorService = new JsonConfigReaderService();

		// exercise
		JsonConfigReader jsonConfigReader = jsonNodeObjectCreatorService
				.createJsonConfigReader(filepath);

		// verify
		assertNotNull(jsonConfigReader);

		// no teardown needed
	}

}
