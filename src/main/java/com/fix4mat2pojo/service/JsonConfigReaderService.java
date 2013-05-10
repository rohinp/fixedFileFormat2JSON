package com.fix4mat2pojo.service;

import java.io.BufferedReader;
import java.io.IOException;

import org.codehaus.jackson.JsonProcessingException;

import com.fix4mat2pojo.factory.FileReaderFactory;
import com.fix4mat2pojo.factory.JSONNodeFactory;
import com.fix4mat2pojo.jsonparser.JsonConfigReader;

public class JsonConfigReaderService {
	public JsonConfigReader createJsonConfigReader(String filepath)
			throws JsonProcessingException, IOException {
		
		BufferedReader fileReader = FileReaderFactory.makeFile(filepath);
		return new JsonConfigReader(JSONNodeFactory.makeJSONNode(fileReader));
	}
}
