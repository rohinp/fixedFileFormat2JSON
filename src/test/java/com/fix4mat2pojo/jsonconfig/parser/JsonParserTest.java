package com.fix4mat2pojo.jsonconfig.parser;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.junit.Test;

import com.fix4mat2pojo.factory.FileReaderFactory;
import com.fix4mat2pojo.factory.JSONNodeFactory;

public class JsonParserTest {

	@Test
	public void itShouldREturntheClassNameFromJsonObject() throws JsonProcessingException, IOException {
		//setup data
		String filepath = "/home/rohin/myworkspace/fixedfileformat2pojo/jsonconfig/employee.json";
		BufferedReader fileReader = FileReaderFactory.makeFile(filepath);
		JsonNode jsonNode = JSONNodeFactory.makeJSONNode(fileReader);
		
		//setup - expected
		String expected = "Employee";
		
		//exercise
		JsonParser jsonParser = new JsonParser(jsonNode);
		String actual = jsonParser.getJSONClassName();
		
		//verify
		assertEquals(expected, actual);
		System.out.println(actual);
	}

}
