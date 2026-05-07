package com.tallerBici.proyecto.DTO;

import java.util.List;

import lombok.Data;

@Data
public class RepuestoDTO {
    private Integer id;
    private String nombreRepuesto;
    private Double precio;
    private String codigoBarras;
    private List<String> boletas;

}
