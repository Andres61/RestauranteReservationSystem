package com.technisoft.tablemingle.service;

import com.technisoft.tablemingle.dto.ReservationDTO;
import com.technisoft.tablemingle.model.Reservation;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationFactoryService {

    public Reservation createReservation(ReservationDTO reservationDTO){
        return new Reservation(reservationDTO);
    }

    public ReservationDTO createReservationDTO(Reservation reservation){
        return new ReservationDTO(reservation);
    }
    public List<ReservationDTO>createReservationDTO(List<Reservation>listReservation){
        List<ReservationDTO> reservationDTOS = new ArrayList<>();
        listReservation.forEach(reservation -> reservationDTOS.add(createReservationDTO(reservation)));
        return reservationDTOS;
    }
}
