package com.segundaparte.controller;

import com.segundaparte.dto.AlumnoDto;
import com.segundaparte.service.DiplomaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/obtener")
public class DiplomaController {

    @PostMapping("/diploma")
    public ResponseEntity obtenerDiploma(@RequestBody AlumnoDto alumno) {
        return new ResponseEntity(DiplomaService.generarDiploma(alumno), HttpStatus.OK);
    }
}
