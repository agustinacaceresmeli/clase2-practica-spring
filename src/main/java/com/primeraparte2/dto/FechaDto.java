package com.primeraparte2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FechaDto {
    private int dia;
    private int mes;
    private int anio;
}
