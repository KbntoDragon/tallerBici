package com.tallerBici.proyecto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tallerBici.proyecto.DTO.BoletaDTO;
import com.tallerBici.proyecto.Service.BoletaService;
import com.tallerBici.proyecto.model.Boleta;

@RestController
@RequestMapping("/api/v1/boletas")
public class BoletaController {

    @Autowired
    private BoletaService boletaService;

    @GetMapping
    public  ResponseEntity<BoletaDTO> obtenerBoletas(){
        List<BoletaDTO> boletas = boletaService.obtenerBoletas();
        if(boletas.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BoletaDTO> buscarPorId(@PathVariable Integer id){
        return new ResponseEntity<>(boletaService.buscarPorId(id), HttpStatus.OK); 
    }

    @PostMapping
    public ResponseEntity<Boleta> guardarBoleta(@RequestBody Boleta boleta){
        Boleta nuevaBoleta = boletaService.guardarBoleta(boleta);
        return new ResponseEntity<>(nuevaBoleta, HttpStatus.CREATED);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarBoleta(@PathVariable Integer id){
        String mensajeAlerta = boletaService.eliminar(id);
        return new ResponseEntity<>(mensajeAlerta, HttpStatus.OK);
    }


}