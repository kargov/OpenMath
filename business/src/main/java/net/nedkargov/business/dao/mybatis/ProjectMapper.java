package net.nedkargov.business.dao.mybatis;

import net.nedkargov.business.domain.ProjectDetailsInterface;
import net.nedkargov.business.domain.ProjectInterface;

import java.util.List;

public interface ProjectMapper {
    List<ProjectInterface> getProjects();
    void insertProject(ProjectDetailsInterface project);
    ProjectDetailsInterface getProjectDetails(Integer id);
    void deleteProject(Integer id);
}
