package com.perfios.dbJsonCol.reqBeans;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.perfios.dbJsonCol.entity.InputData;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class StringToJson {

	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
		String data = "[{\"location\": \"bucket1/file1\", \"password\": \"password-if-any-otherwise-blank\"},{\"location\": \"bucket1/file1\", \"password\": \"password-if-any-otherwise-blank\"}]";
		JSONArray jsonArr = new JSONArray(data);
		
		for (int i = 0; i < jsonArr.length(); i++) {
            JSONObject jsonObj = jsonArr.getJSONObject(i);
            System.out.println(jsonObj);
        }
//		String str = data.substring(1, data.length()-1);
//		String[] f = str.split(",");
//		for(String f1: f) {
//			System.out.println(f1);
//		}
	}

}
