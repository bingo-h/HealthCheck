package com.bingo.server.controller;

import java.util.List;

import com.bingo.server.mapper.HospitalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.server.po.Hospital;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	private HospitalMapper hospitalMapper;
	
	@RequestMapping("/state")
	public List<Hospital> getHospitalsByState(@RequestBody Hospital hospital) {
		return hospitalMapper.getHospitalsByState(hospital.getState());
	}

	@RequestMapping("/get")
	public Hospital getHospitalById(@RequestBody Hospital hospital) {
		return hospitalMapper.getHospitalById(hospital.getHpId());
	}
	
}
