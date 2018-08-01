package com.parachutes.crudbiblioteca.business;
import java.util.ArrayList;
import java.util.List;
import com.parachutes.crudbiblioteca.model.LibrosModel;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LibrosBusinessImpl implements LibrosBusiness {

    private static List<LibrosModel> librosModels;

    @PostConstruct
    public void postConstruct() {
        librosModels = new ArrayList<>();

        LibrosModel librosModel = new LibrosModel();
        librosModel.setIdLibro(1);
        librosModel.setNombreLibro("Mil años de soledad");

        LibrosModel librosModel2 = new LibrosModel();
        librosModel2.setIdLibro(2);
        librosModel2.setNombreLibro("Amore en los tiempos del colera");


        librosModels.add(librosModel);
        librosModels.add(librosModel2);
    }

    @Override
    public List<LibrosModel> listarLibros() {
        return librosModels;
    }

    @Override
    public LibrosModel getLibros(int idLibro) {
        for (LibrosModel librosModel : librosModels) {
            if (librosModel.getIdLibro() == idLibro) {
                return librosModel;
            }
        }
        return null;
    }

    @Override
    public LibrosModel createLibros(LibrosModel librosModel) {
        librosModels.add(librosModel);
        return librosModel;
    }

    @Override
    public LibrosModel updateLibros(LibrosModel librosModel) {
        int index = getIndex(librosModel.getIdLibro());
        if(index == -1) {
            return null;
        }
        librosModels.set(index, librosModel);
        return librosModel;
    }

    private int getIndex(int idLibro) {
        for(int i = 0; 1 <librosModels.size(); i++) {
            LibrosModel librosModel= librosModels.get(i);
            if(librosModel.getIdLibro() == idLibro) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public LibrosModel deleteLibros(int idLibro) {
        int index = getIndex(idLibro);
        if(index == -1) {
            return null;
        }
        return librosModels.remove(index);
    }
}
