package com.technisoft.tablemingle.service;

import com.technisoft.tablemingle.dto.ReservationDTO;
import com.technisoft.tablemingle.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationFactoryService reservationFactoryService;

    @Autowired
    private ReservationRepository reservationRepository;

    public ReservationDTO save(ReservationDTO reservationDTO){
        return reservationFactoryService.createReservationDTO(reservationRepository.save(reservationFactoryService.createReservation(reservationDTO)));
    }

    public List<ReservationDTO>findAll(){
        return reservationFactoryService.createReservationDTO(reservationRepository.findAll());
    }
    public ReservationDTO findById(Integer id){
        return reservationFactoryService.createReservationDTO(reservationRepository.findById(id).get());
    }
    public void deleteById(Integer id){
        reservationRepository.deleteById(id);
    }
}
