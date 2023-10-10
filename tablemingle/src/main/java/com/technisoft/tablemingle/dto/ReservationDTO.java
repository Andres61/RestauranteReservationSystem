package com.technisoft.tablemingle.dto;

import com.technisoft.tablemingle.dto.DinnerTableDTO;
import com.technisoft.tablemingle.model.DiningTable;
import com.technisoft.tablemingle.model.Reservation;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class ReservationDTO {

    private Integer id;
    private List<DinnerTableDTO> diningTablesDTO;
    @CreationTimestamp
    private LocalDateTime reservationDateTime;
    private boolean confirmation;
    private List<ClientDTO> clientDTOS;

    public ReservationDTO(Reservation reservation) {
        this.id = reservation.getId();
        this.diningTablesDTO = new ArrayList<>();
        for (DiningTable diningTable : reservation.getDiningTables()) {
            this.diningTablesDTO.add(new DinnerTableDTO(diningTable));
        }
        this.reservationDateTime = reservation.getReservationDateTime();
        this.confirmation = reservation.isConfirmation();
    }
}