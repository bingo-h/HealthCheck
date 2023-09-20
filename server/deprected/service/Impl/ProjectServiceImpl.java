package com.bingo.server.service.impl;

import com.bingo.server.mapper.ProjectMapper;
import com.bingo.server.po.Project;
import com.bingo.server.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    private Map<String, Object> map = new HashMap<>();

    @Override
    public List<Project> getProjectsByType(Integer type) {
        map.put("type", type);
        return projectMapper.selectByMap(map);
    }



}
