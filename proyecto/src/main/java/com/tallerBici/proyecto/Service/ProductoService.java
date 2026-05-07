package com.tallerBici.proyecto.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tallerBici.proyecto.Repository.ProductoRepository;
import com.tallerBici.proyecto.model.Producto;
@Service
public class ProductoService {
        @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerProductosSinStock() {
        return productoRepository.findByStock(0);
    }
}
