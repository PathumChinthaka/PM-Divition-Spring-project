package lk.topcat.topcatpmdivition.api.api;

import lk.topcat.topcatpmdivition.api.dto.ProjectDTO;
import lk.topcat.topcatpmdivition.api.service.custom.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("pd/api")
public class HandleProjectData {
    @Autowired
    ProjectService projectService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ProjectDTO saveData(
            @RequestBody String projectName,
            Date startDate,
            Date endDate
    ){
       ProjectDTO projectDTO=new ProjectDTO();
       projectDTO.setProjectName(projectName);
       projectDTO.setStartDate(startDate);
       projectDTO.setEndDate(endDate);
       return projectService.saveData(projectDTO);
    }

    @PutMapping("{id}")
    public void updateData(
            @PathVariable String id,
            @RequestPart String projectName,
            @RequestPart Date startDate,
            @RequestPart Date endDate
    ){
        ProjectDTO projectDTO=new ProjectDTO();
        projectDTO.setProjectName(projectName);
        projectDTO.setStartDate(startDate);
        projectDTO.setEndDate(endDate);
        projectService.updateData(id,projectDTO);
    }
}
