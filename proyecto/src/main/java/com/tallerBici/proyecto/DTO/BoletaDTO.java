package com.tallerBici.proyecto.DTO;

import java.util.List;


import lombok.Data;

@Data
public class BoletaDTO {
    private Integer id;
    private Double total;
    private String tipoPago;
    private List<String> empleados;
    private List<String> productos;
    private List<String> repuestos;
    private List<String> servicios;
}
