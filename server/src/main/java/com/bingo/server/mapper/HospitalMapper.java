package com.bingo.server.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import com.bingo.server.po.Hospital;

public interface HospitalMapper extends BaseMapper<Hospital> {

    @Select("select * from hospital where hpId=#{hpId}")
	Hospital getHospitalById(Integer hpId);

    @Select("select * from hospital where state=#{state} order by hpId")
    List<Hospital> getHospitalsByState(Integer state);
}
