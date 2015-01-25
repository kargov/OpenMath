package net.nedkargov.business.service;

import net.nedkargov.business.dao.ProjectDao;
import net.nedkargov.business.domain.ProjectDetailsInterface;
import net.nedkargov.business.domain.ProjectInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class ProjectService implements ProjectServiceInterface {

    private final ProjectDao projectDao;

    @Autowired
    public ProjectService(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    @Override
    public List<ProjectInterface> getProjects() {
        return projectDao.getProjects();
    }

    @Override
    public ProjectDetailsInterface getProjectDetails(Long id) {
        return null;
    }

    @Override
    public ProjectDetailsInterface createProject(ProjectDetailsInterface project) {
        return projectDao.createProject(project);
    }

    @Override
    public void removeProject(Integer id) {
        projectDao.removeProject(id);
    }
}
