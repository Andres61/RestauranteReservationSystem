package com.technisoft.tablemingle.controller;

import com.technisoft.tablemingle.dto.DinnerTableDTO;
import com.technisoft.tablemingle.service.DinnerTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations/v.1/dinner-table")
public class DinnerTableController  {

    @Autowired
    public DinnerTableService dinnerTableService;

    @PostMapping
    public ResponseEntity<DinnerTableDTO> save (@RequestBody DinnerTableDTO dinnerTableDTO){
        return new ResponseEntity<>(dinnerTableService.save(dinnerTableDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<DinnerTableDTO>> findAll(){
        return new ResponseEntity<>(dinnerTableService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<DinnerTableDTO> findById(@PathVariable Integer id){
        try {
            return new ResponseEntity<>(dinnerTableService.findById(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Integer id){
        try {
            dinnerTableService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
