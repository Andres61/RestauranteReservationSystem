package com.technisoft.tablemingle.controller;

import com.technisoft.tablemingle.dto.CommentsDTO;
import com.technisoft.tablemingle.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations/v.1/comments")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

    @PostMapping
    public ResponseEntity<CommentsDTO> save(@RequestBody CommentsDTO commentsDTO){
        return new ResponseEntity<>(commentsService.save(commentsDTO), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<CommentsDTO>> findAll(){
        return new ResponseEntity<>(commentsService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CommentsDTO> findById(@PathVariable Integer id){
        try {
            return new ResponseEntity<>(commentsService.findById(id),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus>deleteById(@PathVariable Integer id){
        try {
            commentsService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
