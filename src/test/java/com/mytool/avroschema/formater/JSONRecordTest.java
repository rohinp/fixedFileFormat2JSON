package com.mytool.avroschema.formater;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mytool.avroschema.formater.JSONRecord;

public class JSONRecordTest {

	@Test
	public void itShouldConverdFixedFormatRecordToJSON() {
		//given
		String record = "rohin               05                 red";
		String expected = "{\"favorite_number\":\"05\",\"favorite_color\":\"red\",\"name\":\"rohin\"}";
		//when
		JSONRecord jsonRecord = new JSONRecord();
		
		String actual = jsonRecord.convert2JSONRecord(record);
		//then
		System.out.println(actual);
		assertEquals(expected, actual);
	}

}
