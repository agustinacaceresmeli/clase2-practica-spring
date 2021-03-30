package com.segundaparte.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DiplomaDto {

    private AlumnoDto alumno;
    private float promedio;
    private String mensaje;
}
