package com.technisoft.tablemingle.controller;

import com.technisoft.tablemingle.dto.PromotionsDTO;
import com.technisoft.tablemingle.service.PromotionsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations/v.1/promotions")
public class PromotionsController {
    @Autowired
    private PromotionsService promotionsService;
    @PostMapping
    public ResponseEntity<PromotionsDTO> save(@RequestBody PromotionsDTO promotionsDTO){
        return new ResponseEntity<>(promotionsService.save(promotionsDTO), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<PromotionsDTO>>findAll(){
        return new ResponseEntity<>(promotionsService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<PromotionsDTO> findById(@PathVariable Integer id) {
        try {
            return new ResponseEntity<>(promotionsService.findById(id),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Integer id){
        try {
            promotionsService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

