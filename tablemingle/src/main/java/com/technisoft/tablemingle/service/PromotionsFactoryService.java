package com.technisoft.tablemingle.service;

import com.technisoft.tablemingle.dto.PromotionsDTO;
import com.technisoft.tablemingle.model.Promotions;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PromotionsFactoryService {

    public Promotions createPromotions(PromotionsDTO promotionsDTO){
        return new Promotions(promotionsDTO);
    }

    public PromotionsDTO createPromotionsDTO(Promotions promotions){
        return new PromotionsDTO(promotions);
    }

    public List<PromotionsDTO> createPromotionsDTO(List<Promotions>listPromotions){
        List<PromotionsDTO> promotionsDTOS = new ArrayList<>();
        listPromotions.forEach(promotions -> promotionsDTOS.add(createPromotionsDTO(promotions)));
        return promotionsDTOS;
    }
}
