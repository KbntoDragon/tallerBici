package com.tallerBici.proyecto.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

public class Boleta {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(nullable = false)
    private Double total;

  @ManyToMany
  @JoinTable(name = "boletas_empleados",
      joinColumns = @JoinColumn(name = "boleta_id"),
      inverseJoinColumns = @JoinColumn(name = "empleado_id")
    )
    private List<Empleado> empleados;

    @ManyToOne
    @JoinColumn (name = "TipoPago_id")
    private TipoPago tipoPago;

<<<<<<< HEAD
    @ManyToMany
    @JoinTable(
      name = "boleta_producto",
      joinColumns = @JoinColumn(name = "boleta_id"),
      inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    private List<Producto> productos;

    @ManyToMany
    @JoinTable(
      name = "boleta_repuesto",
      joinColumns = @JoinColumn(name = "boleta_id"),
      inverseJoinColumns = @JoinColumn(name = "repuesto_id")
    )
    private List<Repuesto> repuestos;

    @ManyToMany
    @JoinTable(
      name = "boleta_servicio",
      joinColumns = @JoinColumn(name = "boleta_id"),
      inverseJoinColumns = @JoinColumn(name = "servicio_id")
    )
    private List<Servicio> servicios;
=======
>>>>>>> 76bcbb9afd70db24e105dfb4c6fb29c7194a72d8
}
