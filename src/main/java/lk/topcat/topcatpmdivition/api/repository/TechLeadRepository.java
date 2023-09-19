package lk.topcat.topcatpmdivition.api.repository;

import lk.topcat.topcatpmdivition.api.entity.TechLead;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechLeadRepository extends JpaRepository<TechLead,String> {
    void deleteDataById(String id);
    TechLead findAllById(String id);
}
