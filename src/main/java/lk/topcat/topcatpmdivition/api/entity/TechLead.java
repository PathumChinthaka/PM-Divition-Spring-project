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
@Entity(name = "TechLead")
public class TechLead implements SuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String techLeadId;
    @Column(name = "name")
    private String name;
    @Column(name = "expertist")
    private String expertist;
    @OneToMany(mappedBy = "techLead",cascade = CascadeType.ALL)
    private List<Project> projectList;
}
