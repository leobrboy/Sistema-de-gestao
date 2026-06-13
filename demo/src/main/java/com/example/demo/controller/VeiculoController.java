package com.example.demo.controller;

import com.example.demo.model.Veiculo;
import com.example.demo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoRepository repository;

    // 1. Cadastrar Veículo (CREATE)
    @PostMapping
    public Veiculo cadastrar(@RequestBody Veiculo veiculo) {
        return repository.save(veiculo);
    }

    // 2. Listar Todos (READ)
    @GetMapping
    public List<Veiculo> listarTodos() {
        return repository.findAll();
    }

    // 3. Filtrar por Status (READ com Filtro)
    @GetMapping("/filtro/status/{status}")
    public List<Veiculo> filtrarPorStatus(@PathVariable String status) {
        return repository.findByStatus(status);
    }

    // 4. Atualizar Informações (UPDATE)
    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> atualizar(@PathVariable Long id, @RequestBody Veiculo veiculoAtualizado) {
        Optional<Veiculo> veiculoExistente = repository.findById(id);

        if (veiculoExistente.isPresent()) {
            Veiculo veiculo = veiculoExistente.get();

            // Atualiza APENAS os 3 campos editáveis pela nossa interface
            veiculo.setPreco(veiculoAtualizado.getPreco());
            veiculo.setQuilometragem(veiculoAtualizado.getQuilometragem());
            veiculo.setStatus(veiculoAtualizado.getStatus());

            repository.save(veiculo);
            return ResponseEntity.ok(veiculo);
        }
        return ResponseEntity.notFound().build();
    }

    // 5. Remover Veículo (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}