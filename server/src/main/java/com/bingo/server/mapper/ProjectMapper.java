package com.bingo.server.mapper;

import com.bingo.server.po.Item;
import com.bingo.server.po.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProjectMapper {

    @Select("select * from setmeal where type=#{type}")
    List<Project> getAllProjects(Integer type);
}
