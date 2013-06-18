package com.mytool.avroschema.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void itShouldGiveAnArrayContainingPositionAndLengthFromGivenString() {
		//given
		String offsetData = "20,1";
		int[] expecteds = {20,1};
		//when
		StringUtil stringUtil = new StringUtil();
		int[] actuals = stringUtil.getPositionAndLength(offsetData);
		//then
		System.out.println(actuals[0] + "----" + actuals[1]);
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void itShouldextractThesubstringForgivenOffsetsFromGivenString() {
		//given
		String record = "rohin               05                 red";
		String offsetData = "1,20";
		String expected = "rohin               ";
		//when
		StringUtil stringUtil = new StringUtil();
		String actual = stringUtil.getSubString(record, offsetData);
		//then
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	
	@Test
	public void itShouldTrimAGivenString() {
		//given
		String record = "rohin               ";
		String expected = "rohin";
		//when
		StringUtil stringUtil = new StringUtil();
		String actual = stringUtil.trim(record);
		//then
		System.out.println(actual);
		assertEquals(expected, actual);
	}

}
