package com.bingo.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.server.po.Hospital;
import com.bingo.server.service.HospitalService;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@RequestMapping("/state")
	public List<Hospital> getHospitalsByState(@RequestBody Hospital hospital) {
		return hospitalService.getHospitalsByState(hospital.getState());
	}

	@RequestMapping("/get")
	public Hospital getHospitalById(@RequestBody Hospital hospital) {
		return hospitalService.getHospitalById(hospital.getHpId());
	}
	
}
