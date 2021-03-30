package com.segundaparte.service;

import com.segundaparte.dto.AlumnoDto;
import com.segundaparte.dto.AsignaturaDto;
import com.segundaparte.dto.DiplomaDto;

import java.util.List;

public class DiplomaService {

    public static DiplomaDto generarDiploma(AlumnoDto almuno) {
        final Float promedio = calcularPromedio(almuno.getAsignaturas());
        final String mensaje = felicitar(promedio);

        return new DiplomaDto(almuno, promedio, mensaje);
    }

    private static Float calcularPromedio(List<AsignaturaDto> asignaturas) {
        int total = 0;
        for (AsignaturaDto asignatura : asignaturas) {
            total += asignatura.getNota();
        }
        return (float) total / asignaturas.size();
    }

    private static String felicitar(Float promedio){
        if (promedio > 9) return "Felicidades!";
        return "";
    }
}
