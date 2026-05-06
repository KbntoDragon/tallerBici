package com.tallerBici.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tallerBici.proyecto.model.Color;

public interface ColorRepository extends JpaRepository<Color, Integer> {

}
