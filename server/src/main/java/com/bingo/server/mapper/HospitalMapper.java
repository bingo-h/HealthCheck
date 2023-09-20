package com.bingo.server.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bingo.server.po.Hospital;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalMapper extends BaseMapper<Hospital> {
}
