package com.tallerBici.proyecto.model;

import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
=======

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "tipo_pagos")
public class TipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank (message = "El tipo de pago es obligatorio")
    @Column (nullable = false)
    private String tipo;

    @OneToMany(mappedBy = "TipoPago")
    private List<Boleta> boletas = new ArrayList<>();
>>>>>>> 76bcbb9afd70db24e105dfb4c6fb29c7194a72d8

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "tipo_pagos")
public class TipoPago{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank (message = "El tipo de pago es obligatorio")
    @Column (nullable = false)
    private String tipo;

    @OneToMany(mappedBy = "TipoPago")
    private List<Boleta> boletas = new ArrayList<>();
}
