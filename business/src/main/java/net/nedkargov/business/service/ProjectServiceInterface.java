package net.nedkargov.business.service;


import net.nedkargov.business.domain.ProjectDetailsInterface;
import net.nedkargov.business.domain.ProjectInterface;

import java.util.List;

public interface ProjectServiceInterface {

    List<ProjectInterface> getProjects();

    ProjectDetailsInterface getProjectDetails(Integer id);

    ProjectDetailsInterface createProject(ProjectDetailsInterface project);

    void removeProject(Integer id);
}
