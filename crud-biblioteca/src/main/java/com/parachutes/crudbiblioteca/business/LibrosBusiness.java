package com.parachutes.crudbiblioteca.business;

import com.parachutes.crudbiblioteca.model.LibrosModel;

import java.util.List;

public interface LibrosBusiness {

    List<LibrosModel> listarLibros();

    LibrosModel getLibros(int idLibro);

    LibrosModel createLibros(LibrosModel librosModel);

    LibrosModel updateLibros(LibrosModel librosModel);

    LibrosModel deleteLibros(int idLibro);
}
