package com.technisoft.tablemingle.repository;

import com.technisoft.tablemingle.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
