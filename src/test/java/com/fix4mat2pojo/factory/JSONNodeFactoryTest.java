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
		//given
		String filepath = "/home/rohin/myworkspace/fixedfileformat2pojo/jsonconfig/customer.json";
		BufferedReader fileReader = FileReaderFactory.makeFile(filepath);
		
		//when 
		JsonNode jsonNode = JSONNodeFactory.makeJSONNode(fileReader);
		
		//then
		assertNotNull(jsonNode);
	}

}
