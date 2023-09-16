package lk.topcat.topcatpmdivition.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectDTO implements SuperDTO {
    private String projectId;
    private String projectName;
    private Date startDate;
    private Date endDate;
}
