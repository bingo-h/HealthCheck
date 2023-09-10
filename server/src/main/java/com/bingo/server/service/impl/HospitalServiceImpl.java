package com.bingo.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingo.server.mapper.HospitalMapper;
import com.bingo.server.po.Hospital;
import com.bingo.server.service.HospitalService;

@Service
public class HospitalServiceImpl implements HospitalService {
	
	@Autowired
	private HospitalMapper hospitalMapper;

	@Override
	public List<Hospital> getHospitalsByState(Integer state) {
		// TODO Auto-generated method stub
		return hospitalMapper.getHospitalsByState(state);
	}

	@Override
	public Hospital getHospitalById(Integer hpId) {
		return hospitalMapper.getHospitalById(hpId);
	}
}
