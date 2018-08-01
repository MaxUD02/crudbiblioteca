package com.parachutes.crudbiblioteca.business;

import com.parachutes.crudbiblioteca.model.UsuariosModel;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class UsuariosBusinessImpl implements UsuariosBusiness {

    private static List<UsuariosModel> usuariosModels;

    @PostConstruct
    public void postConstruct() {
        usuariosModels = new ArrayList<>();

        UsuariosModel usuariosModel = new UsuariosModel();
        usuariosModel.setIdUsuario(1);
        usuariosModel.setNombreUsuario("Max Urbina");

        UsuariosModel usuariosModel2 = new UsuariosModel();
        usuariosModel2.setIdUsuario(2);
        usuariosModel2.setNombreUsuario("Lucas Vasquez");


        usuariosModels.add(usuariosModel);
        usuariosModels.add(usuariosModel2);
    }
    @Override
    public List<UsuariosModel> listarUsuarios() {
        return usuariosModels;
    }

    @Override
    public UsuariosModel getUsuarios(int idUsuario) {
        for (UsuariosModel usuariosModel : usuariosModels) {
            if (usuariosModel.getIdUsuario() == idUsuario) {
                return usuariosModel;
            }
        }
        return null;
    }

    @Override
    public UsuariosModel createUsuarios(UsuariosModel usuariosModel) {
        usuariosModels.add(usuariosModel);
        return usuariosModel;
    }

    @Override
    public UsuariosModel updateUsuarios(UsuariosModel usuariosModel) {
        int index = getIndex(usuariosModel.getIdUsuario());
        if(index == -1) {
            return null;
        }
        usuariosModels.set(index, usuariosModel);
        return usuariosModel;
    }

    private int getIndex(int idUsuario) {
        for(int i = 0; 1 <usuariosModels.size(); i++) {
            UsuariosModel usuariosModel= usuariosModels.get(i);
            if(usuariosModel.getIdUsuario() == idUsuario) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public UsuariosModel deleteUsuarios(int idUsuario) {
        int index = getIndex(idUsuario);
        if(index == -1) {
            return null;
        }
        return usuariosModels.remove(index);
    }
}
