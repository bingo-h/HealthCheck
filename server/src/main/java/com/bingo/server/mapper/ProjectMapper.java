package com.bingo.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bingo.server.po.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProjectMapper extends BaseMapper<Project> {
}
