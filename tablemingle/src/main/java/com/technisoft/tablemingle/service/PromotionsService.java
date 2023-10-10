package com.technisoft.tablemingle.service;

import com.technisoft.tablemingle.dto.PromotionsDTO;
import com.technisoft.tablemingle.repository.PromotionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionsService {

    @Autowired
    private PromotionsFactoryService promotionsFactoryService;

    @Autowired
    private PromotionsRepository promotionsRepository;

    public PromotionsDTO save(PromotionsDTO promotionsDTO){
        return promotionsFactoryService.createPromotionsDTO(promotionsRepository.save(promotionsFactoryService.createPromotions(promotionsDTO)));
    }
    public List<PromotionsDTO>findAll(){
        return promotionsFactoryService.createPromotionsDTO(promotionsRepository.findAll());
    }
    public PromotionsDTO findById(Integer id){
        return promotionsFactoryService.createPromotionsDTO(promotionsRepository.findById(id).get());
    }
    public void deleteById(Integer id){
        promotionsRepository.deleteById(id);
    }
}
