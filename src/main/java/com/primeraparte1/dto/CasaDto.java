package com.primeraparte1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CasaDto {

    private String nombre;
    private String direccion;
    private List<HabitacionDto> habitaciones;
}
