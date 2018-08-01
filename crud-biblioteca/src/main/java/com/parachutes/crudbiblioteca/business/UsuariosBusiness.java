package com.parachutes.crudbiblioteca.business;

import com.parachutes.crudbiblioteca.model.UsuariosModel;

import java.util.List;

public interface UsuariosBusiness {

    List<UsuariosModel> listarUsuarios();

    UsuariosModel getUsuarios(int idUsuario);

    UsuariosModel createUsuarios(UsuariosModel usuariosModel);

    UsuariosModel updateUsuarios(UsuariosModel usuariosModel);

    UsuariosModel deleteUsuarios(int idUsuario);
}
