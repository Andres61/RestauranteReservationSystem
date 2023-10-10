package com.technisoft.tablemingle.model;

import com.technisoft.tablemingle.dto.ClientDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation; // Agrega esta propiedad para representar la relación

    public Client(ClientDTO clientDTO){
        this.id = clientDTO.getId();
        this.name = clientDTO.getName();
        this.email = clientDTO.getEmail();
        this.phoneNumber = clientDTO.getPhoneNumber();
    }
}