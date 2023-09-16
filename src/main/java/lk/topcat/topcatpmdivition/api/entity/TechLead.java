package lk.topcat.topcatpmdivition.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class TechLead implements SuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String techLeadId;
    private String name;
    private String expertist;
    @OneToMany(mappedBy = "techLead",cascade = CascadeType.ALL)
    private List<Project> projectList;
}
