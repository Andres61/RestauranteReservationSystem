package com.technisoft.tablemingle.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MenuDTO {

    private Integer id;
    private String nombre;
    private String descripcion;
    private double precio;

    public MenuDTO(Integer id, String nombre, String descripcion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
}