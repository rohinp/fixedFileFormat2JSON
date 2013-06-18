package com.mytool.avroschema.formater;

import java.util.Iterator;
import java.util.List;

import com.mytool.avroschema.utility.ElementProperties;
import com.mytool.avroschema.utility.StringUtil;

public class JSONRecord {
	private final String JSONStart = "{";
	private final String JSONEnd = "}";
	private final String EscapedDoubleQuotes = "\"";
	private List<String> properties;
	private Iterator<String> iterator;
	StringUtil stringUtil;
	
	public JSONRecord(){
		properties = ElementProperties.getClassProperties();
		iterator = properties.iterator();
		stringUtil = new StringUtil();
	}

	public String convert2JSONRecord(String record) {
		return JSONStart + createJSONRecordData(record) + JSONEnd;
	}
	
	public String createJSONRecordData(String record){
		String jsonString = "";
		String property = "";
		while (iterator.hasNext()) {
			property = iterator.next();
			jsonString += EscapedDoubleQuotes + property + EscapedDoubleQuotes
					+ ":" + EscapedDoubleQuotes
					+ stringUtil.trim(stringUtil.getSubString(record, ElementProperties.getValue(property)))
					+ EscapedDoubleQuotes + ",";
		}
		
		jsonString = jsonString.substring(0,jsonString.length() - 1);
		
		return jsonString;
	}

}
