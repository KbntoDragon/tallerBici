package com.tallerBici.proyecto.DTO;

import java.util.List;

import lombok.Data;

@Data
public class MarcaDTO {
    private Integer id;
    private Integer nombre;
    private List<String> bicicletas;

}
