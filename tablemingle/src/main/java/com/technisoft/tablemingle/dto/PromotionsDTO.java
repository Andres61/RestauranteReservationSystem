package com.technisoft.tablemingle.dto;

import com.technisoft.tablemingle.model.Promotions;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PromotionsDTO {
    private Integer id;
    private String namePromotions;
    private String descriptionPromotions;
    private double discount;

    public PromotionsDTO (Promotions promotions){
        this.id = promotions.getId();
        this.namePromotions = promotions.getNamePromotions();
        this.descriptionPromotions = promotions.getDescriptionPromotion();
        this.discount = promotions.getDiscount();
    }
}
