package net.nedkargov.business.dao.mybatis;

import net.nedkargov.business.dao.ProjectDao;
import net.nedkargov.business.domain.ProjectDetailsInterface;
import net.nedkargov.business.domain.ProjectInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class Dao implements ProjectDao {

    private final ProjectMapper projectMapper;

    @Autowired
    public Dao(ProjectMapper projectMapper) {
        this.projectMapper = projectMapper;
    }

    @Override
    public List<ProjectInterface> getProjects() {
        List<ProjectInterface> projects = projectMapper.getProjects();
        return projects;
    }

    @Override
    public ProjectDetailsInterface createProject(ProjectDetailsInterface project) {
        Integer id = projectMapper.insertProject(project);
        return projectMapper.getProjectDetails(id);
    }

    @Override
    public void removeProject(Integer id) {
        projectMapper.deleteProject(id);
    }
}
