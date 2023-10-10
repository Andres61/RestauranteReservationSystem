package com.technisoft.tablemingle.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nameRestaurant;
    private String address;

    @OneToMany(mappedBy = "restaurant")
    private List<DiningTable> diningTables;

    // Otros campos y métodos si es necesario
}