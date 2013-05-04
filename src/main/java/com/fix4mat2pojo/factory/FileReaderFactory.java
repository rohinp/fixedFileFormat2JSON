package com.fix4mat2pojo.factory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderFactory {
	public static BufferedReader makeFile(String src) throws FileNotFoundException {
		return new BufferedReader(new FileReader(src));
	}
}
