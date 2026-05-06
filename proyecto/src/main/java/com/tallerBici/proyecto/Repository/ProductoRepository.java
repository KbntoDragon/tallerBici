package com.tallerBici.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tallerBici.proyecto.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
