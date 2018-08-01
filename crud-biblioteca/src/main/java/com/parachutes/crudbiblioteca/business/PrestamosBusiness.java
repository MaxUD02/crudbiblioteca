package com.parachutes.crudbiblioteca.business;

import com.parachutes.crudbiblioteca.model.PrestamosModel;

import java.util.List;

public interface PrestamosBusiness {

    List<PrestamosModel> listarPrestamos();

    PrestamosModel getPrestamos(int idPedido);

    PrestamosModel createPrestamos(PrestamosModel prestamosModel);

    PrestamosModel updatePrestamos(PrestamosModel prestamosModel);

    PrestamosModel deletePrestamos(int idPedido);
}
