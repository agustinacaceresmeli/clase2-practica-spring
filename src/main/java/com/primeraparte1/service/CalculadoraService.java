package com.primeraparte1.service;

import com.primeraparte1.dto.HabitacionDto;

import java.util.List;

public class CalculadoraService {
    public  Double calcularArea(List<HabitacionDto> habitaciones){

        double aux=0;
        for(HabitacionDto habitacion: habitaciones){
            aux+=habitacion.getAncho() * habitacion.getLargo();
        }
        return aux;
    }

    public  Double calcularArea(HabitacionDto habitaciones){
        return habitaciones.getLargo()*habitaciones.getAncho();
    }

    public Double valorCasa(double area){
        return area * 800;
    }

    public  HabitacionDto obtenerHabitacionMax(List<HabitacionDto> habitaciones){

        HabitacionDto habitacion = new HabitacionDto();
        double max=0;
        for(int i=0; i<habitaciones.size(); i++){
            if(calcularArea(habitaciones.get(i))>max){
                habitacion=habitaciones.get(i);
                max=calcularArea(habitaciones.get(i));
            }
        }
        return habitacion;
    }
    public double[] obtenerMetro2(List<HabitacionDto> habitaciones){

        double arr[] = new double[habitaciones.size()];
        for(int i=0; i<habitaciones.size(); i++){
            arr[i]=calcularArea(habitaciones.get(i));
        }
        return arr;
    }

}
