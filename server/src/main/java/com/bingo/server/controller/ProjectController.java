package com.bingo.server.controller;

import com.bingo.server.po.Project;
import com.bingo.server.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping("/select")
    public List<Project> getProjectsByType(@RequestBody Project project) {
        System.out.println(projectService.getProjectsByType(project.getType()));
        return projectService.getProjectsByType(project.getType());
    }
}
