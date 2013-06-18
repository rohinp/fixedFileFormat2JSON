package com.mytool.avroschema.utility;

public class StringUtil {
	private final int RecordDataPosition = 0;
	private final int RecordDataLength = 1;
	private final int IndexSubstractor = 1;

	public String getSubString(String record, String offsetLength) {
		int[] positionLength = getPositionAndLength(offsetLength);
		System.out.println(positionLength[0] + " --- " + positionLength[1]);
		return record.substring(positionLength[RecordDataPosition] - IndexSubstractor,
				positionLength[RecordDataPosition]
						+ positionLength[RecordDataLength] - IndexSubstractor);
	}

	public int[] getPositionAndLength(String offsetLength) {
		int[] positionLength = {Integer.parseInt(offsetLength
				.split(",")[RecordDataPosition]),Integer.parseInt(offsetLength
						.split(",")[RecordDataLength])};
		return positionLength;
	}
	
	public String trim(String data){
		return data.replaceAll("\\s","");
	}
}
