package com.parachutes.crudbiblioteca.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuariosModel {

    private int idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String dni;
    private String domicilioUsuario;

}
