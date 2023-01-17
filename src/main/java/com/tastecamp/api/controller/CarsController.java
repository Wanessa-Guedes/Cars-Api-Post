package com.tastecamp.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tastecamp.api.dto.CarsDTO;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    @PostMapping
    public void create(@RequestBody CarsDTO req) {
        System.out.println(req.anoModelo());
        System.out.println(req.dataFabricacao());
        System.out.println(req.modelo());
        System.out.println(req.fabricante());
        System.out.println(req.valor());
    }
}
