package com.technisoft.tablemingle.service;

import com.technisoft.tablemingle.dto.DinnerTableDTO;
import com.technisoft.tablemingle.repository.DinnerTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DinnerTableService {
    @Autowired
    private DinnerTableFactoryService dinnerTableFactoryService;
    @Autowired
    private DinnerTableRepository dinnerTableRepository;

    public DinnerTableDTO save(DinnerTableDTO dinnerTableDTO){
        return dinnerTableFactoryService.createDinnerTableDTO(dinnerTableRepository.save(dinnerTableFactoryService.createDinnerTable(dinnerTableDTO)));
    }
    public List<DinnerTableDTO> findAll(){
        return dinnerTableFactoryService.createDinnerTableDTO(dinnerTableRepository.findAll());

    }
    public DinnerTableDTO findById(Integer id){
        return dinnerTableFactoryService.createDinnerTableDTO(dinnerTableRepository.findById(id).get());
    }
    public void deleteById(Integer id){
        dinnerTableRepository.deleteById(id);
    }
}
