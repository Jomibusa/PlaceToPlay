package com.jomibusa.placetoplay.modelo.interactor;


public class GenerarPagosInteractor {

    public interface onDetailsFetched{
        void onSuccess();
        void onFailure();
        void noResults();
        void campoVacio(String campo);
        void validacionCompleta();
    }


    public void validarDatos(final onDetailsFetched listener, String nombre, String correo, String numero) {

        if(!nombre.replaceAll("\\s","").isEmpty()){
            if(!correo.replaceAll("\\s","").isEmpty()){
                if(!numero.replaceAll("\\s","").isEmpty()){
                    listener.validacionCompleta();
                }else{
                    listener.campoVacio("celular");
                }
            }else{
                listener.campoVacio("correo");
            }
        }else{
            listener.campoVacio("nombre");
        }


    }


}
