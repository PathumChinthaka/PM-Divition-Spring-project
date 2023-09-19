package lk.topcat.topcatpmdivition.api.service.custom.impl;

import lk.topcat.topcatpmdivition.api.dto.ProjectDTO;
import lk.topcat.topcatpmdivition.api.entity.Project;
import lk.topcat.topcatpmdivition.api.repository.ProjectRepository;
import lk.topcat.topcatpmdivition.api.service.custom.ProjectService;
import lk.topcat.topcatpmdivition.api.util.EnitityDTOConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    EnitityDTOConversion conversion;

    @Override
    public ProjectDTO saveData(ProjectDTO dto) {
        dto.setProjectId(UUID.randomUUID().toString());
        Project project=conversion.getProjectEntity(dto);
        projectRepository.save(project);
        return dto;
    }

    @Override
    public void deleteData(String projectId) {
        if(!projectRepository.existsById(projectId)) throw new RuntimeException("Project Data not found");
        projectRepository.deleteProject(projectId);
    }

    @Override
    public void updateData(String projectId, ProjectDTO dto) {
        Optional<Project>project=projectRepository.findById(projectId);
        if(!project.isPresent()) throw new RuntimeException("Project Data not found");
        project.get().setProjectName(dto.getProjectName());
        project.get().setStartDate(dto.getStartDate());
        project.get().setEndDate(dto.getEndDate());
    }

    @Override
    public ProjectDTO getData(String projectId) {
        if(!projectRepository.existsById(projectId)) throw new RuntimeException("Project Data not found");
        Project projectById=projectRepository.findProjectById(projectId);
        return conversion.getProjectDTO(projectById);
    }
}
