package com.example.apiwithpostgres.repositories;

import com.example.apiwithpostgres.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
