package com.tallerBici.proyecto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.tallerBici.proyecto.Service.ProductoService;
import com.tallerBici.proyecto.model.Producto;

public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/sin-stock")
    public List<Producto> sinStock() {
        return productoService.obtenerProductosSinStock();
    }
}
