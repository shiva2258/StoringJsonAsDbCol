package com.perfios.dbJsonCol.service;

import java.util.Optional;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.perfios.dbJsonCol.entity.InputData;
import com.perfios.dbJsonCol.repository.JsonRepo;
import com.perfios.dbJsonCol.reqBeans.Input;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	private JsonRepo repo;

//	InputData data;

	public void saveData(Input input) {
		ObjectMapper mapper = new ObjectMapper();
		String inputFiles = null;
		try {
			inputFiles = mapper.writeValueAsString(input.getFiles());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputData data = new InputData(inputFiles);
		repo.save(data);
	}

//	public void saveData(Input input) {
//		JsonType inputFiles = (JsonType) input.getFiles();
//		InputData data = new InputData(inputFiles);
//		repo.save(data);
//	}

//	public Optional<InputData> getDataByID(int id) {
//		Optional<InputData> data = repo.findById(id);
//		return data;
//	}

	public InputData getDataByID(int id) {
		Optional<InputData> data = repo.findById(id);
		return data.get();
	}

	public JSONArray getInputFiles(int id) {
		Optional<InputData> data = repo.findById(id);
		JSONArray jsonArr = new JSONArray(data.get().getInputFiles());
		for (int i = 0; i < jsonArr.length(); i++) {
            JSONObject jsonObj = jsonArr.getJSONObject(i);
            System.out.println(jsonObj);
        }
		return jsonArr;
	}
}
