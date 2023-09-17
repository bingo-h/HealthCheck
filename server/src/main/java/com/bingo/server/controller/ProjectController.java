package com.bingo.server.controller;

import com.bingo.server.mapper.ProjectMapper;
import com.bingo.server.po.Project;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Resource
    private ProjectMapper projectMapper;

    private final Map<String, Object> map = new HashMap<>();

    @RequestMapping("/select")
    public List<Project> getProjectsByType(@RequestBody Project project) {
        map.put("type", project.getType());
        return projectMapper.selectByMap(map);
    }

    @RequestMapping("/get")
    public Project getProjectById(@RequestBody Project project) {
        return projectMapper.selectById(project.getSmId());
    }
}
