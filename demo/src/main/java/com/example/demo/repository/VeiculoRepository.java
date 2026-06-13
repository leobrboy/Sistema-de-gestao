package com.example.demo.repository;

import com.example.demo.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    // Métodos para o sistema de busca e filtro
    List<Veiculo> findByStatus(String status);
    List<Veiculo> findByAno(Integer ano);
    List<Veiculo> findByMarcaNome(String nomeMarca);
}