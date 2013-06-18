package com.mytool.avroschema.factory;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class FileReader {
	public static BufferedReader GetFileReader(String filePath) throws FileNotFoundException{
		FileInputStream fstream = new FileInputStream(filePath);
        DataInputStream in = new DataInputStream(fstream);
		return new BufferedReader(new InputStreamReader(in));
	}
}
