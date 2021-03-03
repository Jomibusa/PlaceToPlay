package com.jomibusa.placetoplay.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tokenizacion {

    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("provider")
    @Expose
    private String provider;
    @SerializedName("instrument")
    @Expose
    private Instrument instrument;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Tokenizacion{" +
                "status=" + status +
                ", provider='" + provider + '\'' +
                ", instrument=" + instrument +
                '}';
    }
}
