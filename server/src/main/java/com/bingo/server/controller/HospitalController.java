package com.bingo.server.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bingo.server.mapper.HospitalMapper;
import org.apache.ibatis.annotations.Param;
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
		Map<String, Object> map = new HashMap<>();
		map.put("state", hospital.getState());
		return hospitalMapper.selectByMap(map);
	}

	@RequestMapping("/get")
	public Hospital getHospitalById(@RequestBody Hospital hospital) {
		return hospitalMapper.selectById(hospital.getHpId());
	}
	
}
