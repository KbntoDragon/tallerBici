package com.tallerBici.proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "El campo nombres no puede estar vacío")
    @Column(nullable =  f)
    private String nombres;
    @NotBlank(message = "El campo apellidos no puede estar vacío")
    private String apellidos;
}
