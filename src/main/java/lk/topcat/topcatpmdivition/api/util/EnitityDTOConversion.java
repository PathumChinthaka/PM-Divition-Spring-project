package lk.topcat.topcatpmdivition.api.util;

import lk.topcat.topcatpmdivition.api.dto.ProjectDTO;
import lk.topcat.topcatpmdivition.api.dto.TechLeadDTO;
import lk.topcat.topcatpmdivition.api.entity.Project;
import lk.topcat.topcatpmdivition.api.entity.TechLead;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EnitityDTOConversion {
    @Autowired
    private final ModelMapper modelMapper;

    public EnitityDTOConversion(ModelMapper mapper) {
        this.modelMapper=mapper;
    }

    public Project getProjectEntity(ProjectDTO projectDTO){
        return modelMapper.map(projectDTO,Project.class);
    }

    public ProjectDTO getProjectDTO(Project project){
        return modelMapper.map(project,ProjectDTO.class);
    }

    public TechLead getTLEntity(TechLeadDTO techLeadDTO){
        return modelMapper.map(techLeadDTO,TechLead.class);
    }

    public TechLeadDTO getTLDTO(TechLead techLead){
        return modelMapper.map(techLead,TechLeadDTO.class);
    }
}
