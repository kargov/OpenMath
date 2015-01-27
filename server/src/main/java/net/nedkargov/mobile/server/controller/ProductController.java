package net.nedkargov.mobile.server.controller;

import net.nedkargov.business.domain.ProjectDetails;
import net.nedkargov.business.domain.ProjectDetailsInterface;
import net.nedkargov.business.domain.ProjectInterface;
import net.nedkargov.business.service.ProjectServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProjectServiceInterface service;

    @RequestMapping(value = "/api/project", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public ProjectDetailsInterface getProjectDetails(Integer id) {
        ProjectDetailsInterface projectDetails = service.getProjectDetails(id);
        return projectDetails;
    }

    @RequestMapping(value = "/api/project", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public ProjectDetailsInterface create(ProjectDetails project) {
        ProjectDetailsInterface projectDetails = service.createProject(project);
        return projectDetails;
    }

    @RequestMapping(value = "/api/project", method = RequestMethod.DELETE, produces = "application/json; charset=utf-8")
    public void remove(Integer id) {
        service.removeProject(id);
    }
}
