package com.example.demo.controller;

import com.example.demo.model.Modelo;
import com.example.demo.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/modelos")
public class ModeloController {

    @Autowired
    private ModeloRepository repository;

    @PostMapping
    public Modelo cadastrar(@RequestBody Modelo modelo) {
        return repository.save(modelo);
    }

    @GetMapping
    public List<Modelo> listarTodos() {
        return repository.findAll();
    }
}