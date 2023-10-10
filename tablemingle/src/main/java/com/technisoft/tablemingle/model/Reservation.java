package com.technisoft.tablemingle.model;
import com.technisoft.tablemingle.dto.ReservationDTO;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "reservation")
    private List<Client> clients; // Cambia el tipo de datos a List<Client>

    @ManyToMany
    @JoinTable(
            name = "reservation_dining_table",
            joinColumns = @JoinColumn(name = "reservation_id"),
            inverseJoinColumns = @JoinColumn(name = "dining_table_id")
    )
    private List<DiningTable> diningTables; // Cambia la relación a ManyToMany

    @CreationTimestamp
    private LocalDateTime reservationDateTime;

    private boolean confirmation;

    public Reservation(ReservationDTO reservationDTO){
        this.id = reservationDTO.getId();
        this.reservationDateTime = reservationDTO.getReservationDateTime();
        this.confirmation = reservationDTO.isConfirmation();
    }
}