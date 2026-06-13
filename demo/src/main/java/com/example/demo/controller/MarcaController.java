package com.example.demo.controller;

import com.example.demo.model.Marca;
import com.example.demo.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marcas")
public class MarcaController {

    @Autowired
    private MarcaRepository repository;

    @PostMapping
    public Marca cadastrar(@RequestBody Marca marca) {
        return repository.save(marca);
    }

    @GetMapping
    public List<Marca> listarTodos() {
        return repository.findAll();
    }
}