package com.fix4matpojo.service;

import java.io.BufferedReader;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;

import com.fix4mat2pojo.factory.FileReaderFactory;
import com.fix4mat2pojo.factory.JSONNodeFactory;

public class JsonNodeObjectCreatorService {
	public JsonNode getJsonNodeObject(String filepath) throws JsonProcessingException, IOException{
		BufferedReader fileReader = FileReaderFactory.makeFile(filepath);
		return JSONNodeFactory.makeJSONNode(fileReader);
	}
}
