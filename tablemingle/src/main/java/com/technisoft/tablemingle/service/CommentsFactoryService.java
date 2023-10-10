package com.technisoft.tablemingle.service;

import com.technisoft.tablemingle.dto.CommentsDTO;
import com.technisoft.tablemingle.model.Comments;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentsFactoryService {

    public Comments createComments(CommentsDTO commentsDTO){
        return new Comments(commentsDTO);
    }

    public CommentsDTO createCommentsDTO(Comments comments){
        return new CommentsDTO(comments);
    }

    public List<CommentsDTO> createCommentsDTO(List<Comments>listComments){
        List<CommentsDTO>commentsDTOS = new ArrayList<>();
        listComments.forEach(comments -> commentsDTOS.add(createCommentsDTO(comments)));
        return commentsDTOS;
    }
}