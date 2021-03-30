package com.segundaparte.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AlumnoDto {
    private String nombre;
    private List<AsignaturaDto> asignaturas;
}
