package com.parachutes.crudbiblioteca.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class LibrosModel {

    private int idLibro;
    private String nombreLibro;
    private String editorialLibro;
    private String autorLibro;
    private String generoLibro;
    private String paisAutor;
    private int paginasLibro;
    private Date añoEdicion;
    private double precioLibre;

}
