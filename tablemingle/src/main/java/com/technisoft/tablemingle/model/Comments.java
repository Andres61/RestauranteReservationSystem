package com.technisoft.tablemingle.model;

import com.technisoft.tablemingle.dto.ClientDTO;
import com.technisoft.tablemingle.dto.CommentsDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "comments")
public class Comments extends Client {

    private String text;
    private int score;

    public Comments(CommentsDTO commentsDTO){
        this.text = commentsDTO.getText();
        this.score = commentsDTO.getScore();
    }
}