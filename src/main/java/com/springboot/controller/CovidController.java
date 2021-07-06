package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.CovidDataModel;
import com.springboot.service.CovidService;

@RestController
public class CovidController {

	@Autowired
	CovidService service;

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/show")
	public List<CovidDataModel> show() {
		return service.allDataList;
	}

}
