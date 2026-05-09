package com.tallerBici.proyecto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tallerBici.proyecto.Service.ColorService;
import com.tallerBici.proyecto.model.Color;

@RestController
@RequestMapping("/api/v1/colores")
public class ColorController {
    @Autowired
    private ColorService colorService;

    @GetMapping
    public ResponseEntity<List<Color>> todosLosColores() {
        List<Color> colores = colorService.obtenerColores();
        if (colores.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(colores, HttpStatus.OK);
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Color> buscarPorId(@PathVariable Integer id) {
        try {
            Color color = colorService.buscarPorId(id);
            return new ResponseEntity<>(color, HttpStatus.OK);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Color> agregarColor(@RequestBody Color color) {
        try {
            Color guardado = colorService.guardarColor(color);
            return new ResponseEntity<>(guardado, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PatchMapping ("/{id}")
    public ResponseEntity<Color> editarColor(@PathVariable Integer id, @RequestBody Color color) {
        try {
            Color editado = colorService.guardarColor(color);
            return new ResponseEntity<>(editado, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Color> actualizarColor(@PathVariable Integer id, @RequestBody Color color) {
        try {
            Color actualizado = colorService.actualizarColor(id, color);
            return new ResponseEntity<>(actualizado, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<String> eliminarColor(@PathVariable Integer id) {
        String resultado = colorService.eliminar(id);
        
        if (resultado.contains("Eliminado exitosamente!")) {
            return new ResponseEntity<>(resultado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(resultado, HttpStatus.NOT_FOUND);
        }
    }

}
