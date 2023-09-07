package com.bingo.server.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bingo.server.po.Hospital;

public interface HospitalMapper {
	
	Hospital getHospitalsByHId(String hpId);
	
    List<Hospital> getHospitalsByState(Integer state);
}
