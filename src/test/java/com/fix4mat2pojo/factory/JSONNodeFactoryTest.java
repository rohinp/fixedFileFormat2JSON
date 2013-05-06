package com.fix4mat2pojo.factory;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.junit.Test;

public class JSONNodeFactoryTest {

	@Test
	public void itShouldCreateJsonNode() throws JsonProcessingException, IOException {
		//setup - data
		String filepath = "/home/rohin/myworkspace/fixedfileformat2pojo/jsonconfig/employee.json";
		BufferedReader fileReader = FileReaderFactory.makeFile(filepath);
		
		//exercise 
		JsonNode jsonNode = JSONNodeFactory.makeJSONNode(fileReader);
		
		//verify
		assertNotNull(jsonNode);
		
		//no teardown needed
	}

}
