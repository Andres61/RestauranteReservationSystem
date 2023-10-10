package com.technisoft.tablemingle.model;

import com.technisoft.tablemingle.dto.PromotionsDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "promotion")
public class Promotions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String namePromotions;
    private String descriptionPromotion;
    private double discount;

    public Promotions(PromotionsDTO promotionsDTO){
        this.id = promotionsDTO.getId();
        this.namePromotions = promotionsDTO.getNamePromotions();
        this.descriptionPromotion = promotionsDTO.getDescriptionPromotions();
        this.discount = promotionsDTO.getDiscount();
    }
}
