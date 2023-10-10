package com.technisoft.tablemingle.controller;

import com.technisoft.tablemingle.dto.ReservationDTO;
import com.technisoft.tablemingle.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations/v.1/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping
    public ResponseEntity<ReservationDTO>save(@RequestBody ReservationDTO reservationDTO){
        return new ResponseEntity<>(reservationService.save(reservationDTO), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<ReservationDTO>>findAll(){
        return new ResponseEntity<>(reservationService.findAll(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ReservationDTO> findById(@PathVariable Integer id){
        try {
            return new ResponseEntity<>(reservationService.findById(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Integer id){
        try {
            reservationService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
