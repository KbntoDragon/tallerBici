package com.tallerBici.proyecto.DTO;

import java.util.List;

import lombok.Data;

@Data
public class ProductoDTO {
    private Integer id;
    private String nombreProducto;
    private Double precio;
    private String codigoBarras;
    private List<String> boletas;

}
