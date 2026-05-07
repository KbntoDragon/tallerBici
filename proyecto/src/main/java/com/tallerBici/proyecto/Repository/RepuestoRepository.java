package com.tallerBici.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tallerBici.proyecto.model.Repuesto;

@Repository
public interface RepuestoRepository extends JpaRepository<Repuesto, Integer>{
    
}
