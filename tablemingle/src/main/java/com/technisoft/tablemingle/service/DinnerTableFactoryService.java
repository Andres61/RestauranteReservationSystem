package com.technisoft.tablemingle.service;

import com.technisoft.tablemingle.dto.DinnerTableDTO;
import com.technisoft.tablemingle.model.DiningTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DinnerTableFactoryService {

    public DiningTable createDinnerTable(DinnerTableDTO dinnerTableDTO){
        return new DiningTable(dinnerTableDTO);
    }

    public DinnerTableDTO createDinnerTableDTO(DiningTable diningTable){
        return new DinnerTableDTO(diningTable);
    }

    public List<DinnerTableDTO> createDinnerTableDTO(List<DiningTable> listDinnerTable){
        List<DinnerTableDTO> dinnerTableDTOS = new ArrayList<>();
        listDinnerTable.forEach(diningTable -> dinnerTableDTOS.add(createDinnerTableDTO(diningTable)));
        return dinnerTableDTOS;
    }
}
