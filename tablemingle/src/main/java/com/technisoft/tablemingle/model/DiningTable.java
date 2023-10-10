package com.technisoft.tablemingle.model;

import com.technisoft.tablemingle.dto.DinnerTableDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "dining_table")
public class DiningTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int number;
    private int capacity;
    private String state;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    public DiningTable(DinnerTableDTO dinnerTableDTO){
        this.id = dinnerTableDTO.getId();
        this.number = dinnerTableDTO.getNumber();
        this.capacity = dinnerTableDTO.getCapacity();
        this.state = dinnerTableDTO.getState();
    }
}
