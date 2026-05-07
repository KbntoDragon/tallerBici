package com.tallerBici.proyecto.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tallerBici.proyecto.model.Producto;
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    List<Producto> findByStock(Integer stock); 
    List<Producto> findByNombreContainingIgnoreCase(String nombreProducto);
}
