package lk.topcat.topcatpmdivition.api.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tld/api")

public class HandleTechLeadData {

    @PostMapping
    public void saveData(){

    }
}
