package lk.topcat.topcatpmdivition.api.api;

import lk.topcat.topcatpmdivition.api.dto.ProjectDTO;
import lk.topcat.topcatpmdivition.api.service.custom.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("pd/api")
public class HandleProjectData {
    @Autowired
    ProjectService projectService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ProjectDTO saveData(
            @RequestBody String projectName,
            @RequestBody Date startDate,
            @RequestBody Date endDate
    ){
        ProjectDTO projectDTO=new ProjectDTO();
        projectDTO.setProjectName(projectName);
        projectDTO.setStartDate(startDate);
        projectDTO.setEndDate(endDate);
        return projectService.saveData(projectDTO);
    }
}
