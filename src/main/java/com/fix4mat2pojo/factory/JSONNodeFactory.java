package com.fix4mat2pojo.factory;

import java.io.BufferedReader;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JSONNodeFactory {
	public static JsonNode makeJSONNode(BufferedReader fileReader) throws JsonProcessingException, IOException{
		return (new ObjectMapper()).readTree(fileReader);
	}
}
