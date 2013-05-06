package com.fix4mat2pojo.factory;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

import org.junit.Test;

import com.fix4mat2pojo.utility.LocalProperties;

public class FileReaderFactoryTest {

	@Test
	public void itShouldReturnObjectToReadFile() throws FileNotFoundException {
		//setup - data
		String filepath = LocalProperties.getString("jsonfilepath"); //$NON-NLS-1$
		
		//exercise
		BufferedReader fileReader = FileReaderFactory.makeFile(filepath); 
		
		//verify
		assertNotNull(fileReader);
		
		//no teardown needed
	}

}
