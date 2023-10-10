package com.technisoft.tablemingle.repository;

import com.technisoft.tablemingle.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
}
