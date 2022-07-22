package com.example.apiwithpostgres.services;

import com.example.apiwithpostgres.entities.Cliente;
import com.example.apiwithpostgres.repositories.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private IClienteRepository clienteRepository;

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> findById(Long id){
        return clienteRepository.findById(id);
    }

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }
}
