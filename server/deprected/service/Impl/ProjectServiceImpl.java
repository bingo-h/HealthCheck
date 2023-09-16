package com.bingo.server.service.impl;

import com.bingo.server.mapper.ProjectMapper;
import com.bingo.server.po.Project;
import com.bingo.server.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public List<Project> getProjectsByType(Integer type) {
        return projectMapper.getProjectsByType(type);
    }

    @Override
    public Project getProjectsById(Integer smId) {
        return projectMapper.getProjectById(smId);
    }
}
