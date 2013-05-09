package com.fix4mat2pojo.jsonparser;

import org.codehaus.jackson.JsonNode;

import com.fix4mat2pojo.utility.JsonConfigProperties;

public class JsonConfigReader {
	private JsonNode jsonNode;
	
	public JsonConfigReader(JsonNode jsonNode) {
		this.setJsonNode(jsonNode);
	}
	
	public void setJsonNode(JsonNode jsonNode) {
		this.jsonNode = jsonNode;
	}
	
	public JsonNode getJsonNode() {
		return this.jsonNode;
	}
	
	public String getJSONClassName(){
		return this.jsonNode.path(JsonConfigProperties.getString("classname")).getTextValue().toString(); //$NON-NLS-1$
	}
	
	public JsonNode getJSONFields(){
		return this.jsonNode.get(JsonConfigProperties.getString("properties")); //$NON-NLS-1$
	}
	
}
