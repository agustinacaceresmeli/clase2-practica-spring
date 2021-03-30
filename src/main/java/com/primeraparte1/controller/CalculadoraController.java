package com.primeraparte1.controller;

import com.primeraparte1.dto.CasaDto;
import com.primeraparte1.dto.HabitacionDto;
import com.primeraparte1.service.CalculadoraService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @PostMapping("/casa")
    public ResponseEntity calcularArea(@RequestBody CasaDto casa){
        double res;
        CalculadoraService calcular = new CalculadoraService();
        res = calcular.calcularArea(casa.getHabitaciones());
        return new ResponseEntity<>("{area:"+ res +"}", HttpStatus.OK);
    }
    @PostMapping("/valorcasa")
    public ResponseEntity valorCasa(@RequestBody CasaDto casa){
        double res;
        CalculadoraService calcular = new CalculadoraService();
        res = calcular.valorCasa(calcular.calcularArea(casa.getHabitaciones()));
        return new ResponseEntity<>("{area:"+ res +"}", HttpStatus.OK);
    }

    @PostMapping("/maxhabitacion")
    public ResponseEntity habitacionMax(@RequestBody CasaDto casa){
        HabitacionDto res;
        CalculadoraService calcular = new CalculadoraService();
        res = calcular.obtenerHabitacionMax(casa.getHabitaciones());
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @PostMapping("/metroscuadrados")
    public ResponseEntity obtenerMetros2(@RequestBody CasaDto casa){
        double res[]= new double[casa.getHabitaciones().size()];
        CalculadoraService calcular = new CalculadoraService();
        res = calcular.obtenerMetro2(casa.getHabitaciones());
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
