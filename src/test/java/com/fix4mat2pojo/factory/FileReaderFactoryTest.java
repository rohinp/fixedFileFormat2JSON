package com.fix4mat2pojo.factory;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

import org.junit.Test;

public class FileReaderFactoryTest {

	@Test
	public void itShouldReturnObjectToReadFile() throws FileNotFoundException {
		//setup - data
		String filepath = "/home/rohin/myworkspace/fixedfileformat2pojo/jsonconfig/employee.json";
		
		//exercise
		BufferedReader fileReader = FileReaderFactory.makeFile(filepath); 
		
		//verify
		assertNotNull(fileReader);
		
		//no teardown needed
	}

}
