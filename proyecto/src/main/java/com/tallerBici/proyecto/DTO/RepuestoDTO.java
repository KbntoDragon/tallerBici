package com.tallerBici.proyecto.DTO;

import java.util.List;

import lombok.Data;

@Data
public class RepuestoDTO {
    private Integer id;
    private String nombreRepuesto;
    private Double precio;
    private Integer stockRepuesto;
    private String codigoBarras;
    private List<Integer> boletas;

}
