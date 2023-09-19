package lk.topcat.topcatpmdivition.api.service.custom.impl;

import lk.topcat.topcatpmdivition.api.dto.TechLeadDTO;
import lk.topcat.topcatpmdivition.api.entity.TechLead;
import lk.topcat.topcatpmdivition.api.repository.TechLeadRepository;
import lk.topcat.topcatpmdivition.api.service.custom.TLService;
import lk.topcat.topcatpmdivition.api.util.EnitityDTOConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class TLServiceImpl implements TLService {

    @Autowired
    EnitityDTOConversion dtoConversion;

    @Autowired
    TechLeadRepository techLeadRepository;

    @Override
    public TechLeadDTO saveData(TechLeadDTO dto) {
        dto.setTechLeadId(UUID.randomUUID().toString());
        TechLead techLead=dtoConversion.getTLEntity(dto);
        techLeadRepository.save(techLead);
        return dto;
    }

    @Override
    public void deleteData(String techLeadId) {
        if(!techLeadRepository.existsById(techLeadId))throw new RuntimeException("Techlead ID not found");
        techLeadRepository.deleteDataById(techLeadId);
    }

    @Override
    public void updateData(String id, TechLeadDTO dto) {
        Optional<TechLead>techLead=techLeadRepository.findById(id);
        if(!techLead.isPresent()) throw new RuntimeException("Techlead Object not found");
        techLead.get().setTechLeadId(dto.getName());
        techLead.get().setExpertist(dto.getExpertist());
    }

    @Override
    public TechLeadDTO getData(String id) {
        return null;
    }
}
