package com.technisoft.tablemingle.controller;

import com.technisoft.tablemingle.dto.ClientDTO;
import com.technisoft.tablemingle.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations/v.1/client")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @PostMapping
    public ResponseEntity<ClientDTO> save(@RequestBody ClientDTO clientDTO){
        return new ResponseEntity<>(clientService.save(clientDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ClientDTO>> findAll(){
        return new ResponseEntity<>(clientService.findAll(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Integer id){
        try {
            return new ResponseEntity<>(clientService.findById(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus>deleteById(@PathVariable Integer id){
        try {
            clientService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
