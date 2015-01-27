package net.nedkargov.business.dao;

import net.nedkargov.business.domain.ProjectDetailsInterface;
import net.nedkargov.business.domain.ProjectInterface;

import java.util.List;

public interface ProjectDao {
    List<ProjectInterface> getProjects();
    ProjectDetailsInterface createProject(ProjectDetailsInterface project);
    void removeProject(Integer id);
    ProjectDetailsInterface getProjectDetails(Integer id);
}
