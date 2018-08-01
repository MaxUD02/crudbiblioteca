package com.parachutes.crudbiblioteca.controller;


import com.parachutes.crudbiblioteca.business.PrestamosBusiness;
import com.parachutes.crudbiblioteca.model.PrestamosModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PrestamosController {

    @Autowired
    private PrestamosBusiness prestamosBusiness;

    @GetMapping("/prestamos") //endpoint
    public List<PrestamosModel> listarPrestamos(){

        return prestamosBusiness.listarPrestamos();
    }

    @GetMapping("/prestamos/{idPedido}")
    public PrestamosModel getPrestamos(@PathVariable("idPedido") int idPedido) {
        return prestamosBusiness.getPrestamos(idPedido);
    }

    @PostMapping("/prestamos")
    public PrestamosModel createPrestamos(@RequestBody PrestamosModel prestamosModel) {
        return prestamosBusiness.createPrestamos(prestamosModel);
    }

    @PutMapping("/prestamos")
    public PrestamosModel updatePrestamos(@RequestBody PrestamosModel prestamosModel) {
        return prestamosBusiness.updatePrestamos(prestamosModel);
    }

    @DeleteMapping("/prestamos/{idPedido}")
    public PrestamosModel deletePrestamos(@PathVariable("idPedido") int idPedido) {
        return prestamosBusiness.deletePrestamos(idPedido);
    }
}
