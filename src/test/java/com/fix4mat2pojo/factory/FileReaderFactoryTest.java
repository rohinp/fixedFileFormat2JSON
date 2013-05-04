package com.fix4mat2pojo.factory;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

import org.junit.Test;

public class FileReaderFactoryTest {

	@Test
	public void itShouldReturnObjectToReadFile() throws FileNotFoundException {
		//given
		String filepath = "/home/rohin/myworkspace/fixedfileformat2pojo/jsonconfig/customer.json";
		//when
		BufferedReader fileReader = FileReaderFactory.makeFile(filepath); 
		//then
		assertNotNull(fileReader);
	}

}
