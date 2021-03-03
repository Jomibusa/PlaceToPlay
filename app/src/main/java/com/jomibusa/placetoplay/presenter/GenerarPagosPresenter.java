package com.jomibusa.placetoplay.presenter;

import androidx.annotation.NonNull;

import com.jomibusa.placetoplay.base.BasePresenter;
import com.jomibusa.placetoplay.modelo.interactor.GenerarPagosInteractor;
import com.jomibusa.placetoplay.view.ContenedorGenerarPagos;

public class GenerarPagosPresenter extends BasePresenter implements GenerarPagosInteractor.onDetailsFetched{

    private ContenedorGenerarPagos view;
    private GenerarPagosInteractor pagosInteractor;

    public GenerarPagosPresenter(@NonNull ContenedorGenerarPagos view, @NonNull GenerarPagosInteractor pagosInteractor) {
        this.view = view;
        this.pagosInteractor = pagosInteractor;
    }

    public void realizarValidacion(String nombre, String correo, String numero){
        pagosInteractor.validarDatos(this, nombre, correo, numero);
    }

    @Override
    public void campoVacio(String campo) {
        view.validarInfo(campo);
    }

    @Override
    public void validacionCompleta() {
        view.showInfoCard();
    }


    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailure() {

    }

    @Override
    public void noResults() {

    }

}
