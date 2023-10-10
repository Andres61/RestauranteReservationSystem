package com.technisoft.tablemingle.dto;

import com.technisoft.tablemingle.model.Client;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientDTO {

    private Integer id;
    private String name;
    private String email;
    private String phoneNumber;

    public ClientDTO(Client client){
        this.id = client.getId();
        this.name = client.getName();
        this.email = client.getEmail();
        this.phoneNumber = client.getPhoneNumber();
    }
}

