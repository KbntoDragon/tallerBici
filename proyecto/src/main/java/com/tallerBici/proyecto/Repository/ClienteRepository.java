package com.tallerBici.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tallerBici.proyecto.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


}
