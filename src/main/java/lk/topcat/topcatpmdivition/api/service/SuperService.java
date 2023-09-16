package lk.topcat.topcatpmdivition.api.service;

import lk.topcat.topcatpmdivition.api.dto.SuperDTO;

public interface SuperService <T extends SuperDTO>{
    T saveData(T dto);
    void deleteData(String id);
    void updateData(String id,T dto);
    T getData(String id);
}
