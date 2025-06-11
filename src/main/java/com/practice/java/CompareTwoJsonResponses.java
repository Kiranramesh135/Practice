package com.practice.java;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CompareTwoJsonResponses {
	
	public static void main(String[] args) {
		
		JSONObject jo1 = convertToJsonObject("input1");
		JSONObject jo2 = convertToJsonObject("input2");
//		jo1.
		
		System.out.println(jo1.equals(jo2));
		if(jo1.size()==jo2.size()) {
//			for(Map.Entry<Object, Object>:jo1.entrySet())
		}
		
		
	}
	
	public static JSONObject convertToJsonObject(String jsonFileName) {
		JSONParser parser = new JSONParser();
		System.out.println(System.getProperty("user.dir")+"/resources/JsonInput/"+jsonFileName+".json");
		JSONObject jObject;
		try {
			jObject = (JSONObject)parser.parse(new FileReader(System.getProperty("user.dir")+"/resources/JsonInput/"+jsonFileName+".json"));
			System.out.println(jObject.get("website"));
			return jObject;
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}
