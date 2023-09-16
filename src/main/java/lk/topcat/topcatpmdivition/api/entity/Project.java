package lk.topcat.topcatpmdivition.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Project implements SuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String projectId;
    private String projectName;
    private Date startDate;
    private Date endDate;
    @ManyToOne
    @JoinColumn(name = "techLeadId")
    private TechLead techLead;
}
