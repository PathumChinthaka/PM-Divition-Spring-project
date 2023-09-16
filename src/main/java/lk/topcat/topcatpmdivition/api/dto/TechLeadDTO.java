package lk.topcat.topcatpmdivition.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TechLeadDTO implements SuperDTO {
    private String techLeadId;
    private String name;
    private String expertist;
}
