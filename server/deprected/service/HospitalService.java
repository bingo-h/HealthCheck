package com.bingo.server.service;

import java.util.List;

import com.bingo.server.po.Hospital;

public interface HospitalService {

	List<Hospital> getHospitalsByState(Integer state);

	Hospital getHospitalById(Integer hpId);
}
