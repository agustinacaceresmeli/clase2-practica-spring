package com.primeraparte1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HabitacionDto {
    private String nombre;
    private Double ancho;
    private Double largo;
}
