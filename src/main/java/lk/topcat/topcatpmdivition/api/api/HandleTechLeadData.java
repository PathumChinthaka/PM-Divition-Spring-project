package lk.topcat.topcatpmdivition.api.api;

import lk.topcat.topcatpmdivition.api.dto.TechLeadDTO;
import lk.topcat.topcatpmdivition.api.service.custom.TLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tld/api")
public class HandleTechLeadData {

    @Autowired
    TLService tlService;

    @PostMapping
    public TechLeadDTO saveData(@RequestParam String name,@RequestParam String expertist){
        TechLeadDTO techLeadDTO=new TechLeadDTO();
        techLeadDTO.setName(name);
        techLeadDTO.setExpertist(expertist);
        return tlService.saveData(techLeadDTO);
    }

    @PutMapping("{id}")
    public void updateData(
            @PathVariable String id,
            @RequestPart String name,
            @RequestPart String expertist
    ){
        TechLeadDTO techLeadDTO=new TechLeadDTO();
        techLeadDTO.setName(name);
        techLeadDTO.setExpertist(expertist);
        tlService.updateData(id,techLeadDTO);
    }

    @DeleteMapping("{id}")
    public void deleteData(@PathVariable String id){
        tlService.deleteData(id);
    }
}
