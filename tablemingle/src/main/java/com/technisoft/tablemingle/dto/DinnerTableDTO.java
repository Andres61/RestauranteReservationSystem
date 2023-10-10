package com.technisoft.tablemingle.dto;

import com.technisoft.tablemingle.model.DiningTable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DinnerTableDTO {
    private Integer id;
    private int number;
    private int capacity;
    private String state;

    public DinnerTableDTO(DiningTable diningTable){
        this.id = diningTable.getId();
        this.number = diningTable.getNumber();
        this.capacity = diningTable.getCapacity();
        this.state = diningTable.getState();

    }
}
