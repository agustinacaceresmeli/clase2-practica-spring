package com.primeraparte2.controller;

import com.primeraparte2.dto.FechaDto;
import com.primeraparte2.service.EdadService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calcular")
public class EdadController {

    @GetMapping("/edad")
    public int buscar(@RequestBody FechaDto fecha){
       return EdadService.convertirEdad(fecha);
    }
}
