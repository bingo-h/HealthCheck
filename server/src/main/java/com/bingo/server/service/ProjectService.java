package com.bingo.server.service;

import com.bingo.server.po.Project;

import java.util.List;

public interface ProjectService {
    List<Project> getProjectsByType(Integer type);

    Project getProjectsById(Integer smId);
}
