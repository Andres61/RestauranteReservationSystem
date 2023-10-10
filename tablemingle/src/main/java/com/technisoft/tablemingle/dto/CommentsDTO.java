package com.technisoft.tablemingle.dto;

import com.technisoft.tablemingle.model.Comments;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommentsDTO {

    private Integer id;
    private String text;
    private int score;

    public CommentsDTO (Comments comments){
        this.id = comments.getId();
        this.text = comments.getText();
        this.score = comments.getScore();
    }
}
