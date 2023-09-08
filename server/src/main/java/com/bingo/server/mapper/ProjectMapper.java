package com.bingo.server.mapper;

import com.bingo.server.po.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProjectMapper {

    List<Project> getProjectsByType(Integer type);

    @Select("select * from setmeal where smId=#{smId}")
    Project getProjectById(Integer smId);
}
