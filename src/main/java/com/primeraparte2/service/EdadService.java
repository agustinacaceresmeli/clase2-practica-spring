package com.primeraparte2.service;
import com.primeraparte2.dto.FechaDto;

import java.time.LocalDate;
import java.time.Period;

public class EdadService {

    public static int convertirEdad(FechaDto fecha){
        LocalDate date = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());
        Period period = Period.between(date,LocalDate.now());

        return period.getYears();
    }
}
