package com.parachutes.crudbiblioteca.controller;


import com.parachutes.crudbiblioteca.business.LibrosBusiness;
import com.parachutes.crudbiblioteca.model.LibrosModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibrosController {

    @Autowired
    private LibrosBusiness librosBusiness;

    @GetMapping("/libros") //endpoint
    public List<LibrosModel> listarLibros(){

        return librosBusiness.listarLibros();
    }

    @GetMapping("/libros/{idLibro}")
    public LibrosModel getLibros(@PathVariable("idLibro") int idLibro) {
        return librosBusiness.getLibros(idLibro);
    }

    @PostMapping("/libros")
    public LibrosModel createLibros(@RequestBody LibrosModel librosModel) {
        return librosBusiness.createLibros(librosModel);
    }

    @PutMapping("/libros")
    public LibrosModel updateLibros(@RequestBody LibrosModel librosModel) {
        return librosBusiness.updateLibros(librosModel);
    }

    @DeleteMapping("/libros/{idLibro}")
    public LibrosModel deleteLibros(@PathVariable("idLibro") int idLibro) {
        return librosBusiness.deleteLibros(idLibro);
    }


}
