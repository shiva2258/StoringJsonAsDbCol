package com.perfios.dbJsonCol.controller;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perfios.dbJsonCol.entity.InputData;
import com.perfios.dbJsonCol.reqBeans.Input;
import com.perfios.dbJsonCol.service.Service;

@RestController
@RequestMapping
public class Controller {

	@Autowired
	private Service service;

	@PostMapping("/save")
	public void save(@RequestBody Input input) {
		service.saveData(input);
	}

//	@GetMapping("/getById/{id}")
//	public Optional<InputData> getDataByID(@PathVariable("id") int id) {
//		return service.getDataByID(id);
//	}

	@GetMapping("/getById/{id}")
	public InputData getDataByID(@PathVariable("id") int id) {
		return service.getDataByID(id);
	}
	
	@GetMapping("/getInputFiles/{id}")
	public JSONArray getInputFilesByID(@PathVariable int id) {
		return service.getInputFiles(id);
	}

}
