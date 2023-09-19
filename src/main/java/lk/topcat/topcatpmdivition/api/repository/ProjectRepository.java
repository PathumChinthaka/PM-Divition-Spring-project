package lk.topcat.topcatpmdivition.api.repository;

import lk.topcat.topcatpmdivition.api.dto.ProjectDTO;
import lk.topcat.topcatpmdivition.api.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,String> {
    void deleteProject(String id);
    Project findProjectById(String id);
}
