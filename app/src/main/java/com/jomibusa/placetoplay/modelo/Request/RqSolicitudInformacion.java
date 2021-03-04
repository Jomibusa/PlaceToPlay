package com.jomibusa.placetoplay.modelo.Request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RqSolicitudInformacion {

    @SerializedName("auth")
    @Expose
    private Auth auth;
    @SerializedName("instrument")
    @Expose
    private Instrument instrument;
    @SerializedName("payment")
    @Expose
    private Payment payment;

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }


}
