package com.fix4mat2pojo.factory;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.junit.Test;

import com.fix4mat2pojo.utility.LocalProperties;

public class JSONNodeFactoryTest {

	@Test
	public void itShouldCreateJsonNode() throws JsonProcessingException, IOException {
		//setup - data
		String filepath = LocalProperties.getString("jsonfilepath");
		BufferedReader fileReader = FileReaderFactory.makeFile(filepath);
		
		//exercise 
		JsonNode jsonNode = JSONNodeFactory.makeJSONNode(fileReader);
		
		//verify
		assertNotNull(jsonNode);
		
		//no teardown needed
	}

}
