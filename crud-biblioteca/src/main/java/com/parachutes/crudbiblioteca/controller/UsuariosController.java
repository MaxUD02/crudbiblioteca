package com.parachutes.crudbiblioteca.controller;


import com.parachutes.crudbiblioteca.business.UsuariosBusiness;
import com.parachutes.crudbiblioteca.model.UsuariosModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuariosController {

    @Autowired
    private UsuariosBusiness usuariosBusiness;

    @GetMapping("/usuarios") //endpoint
    public List<UsuariosModel> listarUsuarios(){

        return usuariosBusiness.listarUsuarios();
    }

    @GetMapping("/usuarios/{idUsuario}")
    public UsuariosModel getUsuarios(@PathVariable("idUsuario") int idUsuario) {
        return usuariosBusiness.getUsuarios(idUsuario);
    }

    @PostMapping("/usuarios")
    public UsuariosModel createUsuarios(@RequestBody UsuariosModel usuariosModel) {
        return usuariosBusiness.createUsuarios(usuariosModel);
    }

    @PutMapping("/usuarios")
    public UsuariosModel updateUsuarios(@RequestBody UsuariosModel usuariosModel) {
        return usuariosBusiness.updateUsuarios(usuariosModel);
    }

    @DeleteMapping("/usuarios/{idUsuario}")
    public UsuariosModel deleteUsuarios(@PathVariable("idUsuario") int idUsuario) {
        return usuariosBusiness.deleteUsuarios(idUsuario);
    }
}
