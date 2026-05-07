package com.tallerBici.proyecto.DTO;

import lombok.Data;

@Data
public class ClienteDTO {
    private Integer id;
    private String nombres;
    private String correo;
    private String telefono;
    private Integer bicicletaId;
}
