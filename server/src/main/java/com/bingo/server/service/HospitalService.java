package com.bingo.server.service;

import java.util.List;

import com.bingo.server.po.Hospital;

public interface HospitalService {

	public List<Hospital> getHospitalsByState(Integer state);
}
