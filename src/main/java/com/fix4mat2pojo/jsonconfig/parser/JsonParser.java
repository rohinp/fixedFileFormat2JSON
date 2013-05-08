package com.fix4mat2pojo.jsonconfig.parser;

import org.codehaus.jackson.JsonNode;

public class JsonParser {
	private JsonNode jsonNode;
	
	public JsonParser(JsonNode jsonNode) {
		this.setJsonNode(jsonNode);
	}
	
	public void setJsonNode(JsonNode jsonNode) {
		this.jsonNode = jsonNode;
	}
	
	public JsonNode getJsonNode() {
		return this.jsonNode;
	}
	
	public String getJSONClassName(){
		return this.jsonNode.path("name").getTextValue().toString();
	}
	
	public JsonNode getJSONFields(){
		return this.jsonNode.path("Fields");
	}
	
}
