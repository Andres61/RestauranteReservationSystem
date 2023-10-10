package com.technisoft.tablemingle.service;

import com.technisoft.tablemingle.dto.CommentsDTO;
import com.technisoft.tablemingle.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsService {

    @Autowired
    private CommentsFactoryService commentsFactoryService;
    @Autowired
    private CommentsRepository commentsRepository;

    public CommentsDTO save(CommentsDTO commentsDTO){
        return commentsFactoryService.createCommentsDTO(commentsRepository.save(commentsFactoryService.createComments(commentsDTO)));
    }

    public List<CommentsDTO> findAll(){
        return commentsFactoryService.createCommentsDTO(commentsRepository.findAll());
    }

    public CommentsDTO findById(Integer id){
        return commentsFactoryService.createCommentsDTO(commentsRepository.findById(id).get());
    }
    public void deleteById(Integer id){
        commentsRepository.deleteById(id);
    }
}
