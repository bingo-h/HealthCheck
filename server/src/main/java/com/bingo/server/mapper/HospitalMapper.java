package com.bingo.server.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bingo.server.po.Hospital;

public interface HospitalMapper {

    @Select("select * from hospital where hpId=#{hpId}")
	Hospital getHospitalsByHId(String hpId);

    @Select("select * from hospital where state=#{state} order by hpId")
    List<Hospital> getHospitalsByState(Integer state);
}
