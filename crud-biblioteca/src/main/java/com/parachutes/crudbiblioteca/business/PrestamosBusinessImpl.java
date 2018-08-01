package com.parachutes.crudbiblioteca.business;

import com.parachutes.crudbiblioteca.model.PrestamosModel;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class PrestamosBusinessImpl  implements PrestamosBusiness{
    private static List<PrestamosModel> prestamosModels;

    @PostConstruct
    public void postConstruct() {
        prestamosModels = new ArrayList<>();

        PrestamosModel prestamosModel = new PrestamosModel();
        prestamosModel.setIdPedido(1);
        prestamosModel.setIdLibro(1);

        PrestamosModel prestamosModel2 = new PrestamosModel();
        prestamosModel2.setIdPedido(2);
        prestamosModel2.setIdLibro(1);


        prestamosModels.add(prestamosModel);
        prestamosModels.add(prestamosModel2);
    }


    @Override
    public List<PrestamosModel> listarPrestamos() {
        return prestamosModels;
    }

    @Override
    public PrestamosModel getPrestamos(int idPedido) {
        for (PrestamosModel prestamosModel : prestamosModels) {
            if (prestamosModel.getIdPedido() == idPedido) {
                return prestamosModel;
            }
        }
        return null;
    }

    @Override
    public PrestamosModel createPrestamos(PrestamosModel prestamosModel) {
        prestamosModels.add(prestamosModel);
        return prestamosModel;
    }

    @Override
    public PrestamosModel updatePrestamos(PrestamosModel prestamosModel) {
        int index = getIndex(prestamosModel.getIdPedido());
        if(index == -1) {
            return null;
        }
        prestamosModels.set(index, prestamosModel);
        return prestamosModel;
    }

    private int getIndex(int idPedido) {
        for(int i = 0; 1 <prestamosModels.size(); i++) {
            PrestamosModel prestamosModel= prestamosModels.get(i);
            if(prestamosModel.getIdPedido() == idPedido) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public PrestamosModel deletePrestamos(int idPedido) {
        int index = getIndex(idPedido);
        if(index == -1) {
            return null;
        }
        return prestamosModels.remove(index);
    }
}
