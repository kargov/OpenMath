package net.nedkargov.mobile.server.controller;

import net.nedkargov.business.domain.ProjectDetails;
import net.nedkargov.business.domain.ProjectInterface;
import net.nedkargov.business.service.ProjectServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    private ProjectServiceInterface service;

    @RequestMapping(value = "/api/projects", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public List<ProjectInterface> getAll() {
        return service.getProjects();
    }
}
