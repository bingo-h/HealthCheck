package com.bingo.server.mapper;

import com.bingo.server.po.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectMapper {
    List<Project> getAllProjects(Integer type);
}
