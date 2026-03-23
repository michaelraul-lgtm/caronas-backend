package com.example.demo.controller;

import com.example.demo.model.Carona;
import com.example.demo.repository.CaronaRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/caronas")
@CrossOrigin(origins = "*")
public class CaronaController {

    private final CaronaRepository repository;

    public CaronaController(CaronaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Carona> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Carona criar(@RequestBody Carona carona) {
        return repository.save(carona);
    }
}