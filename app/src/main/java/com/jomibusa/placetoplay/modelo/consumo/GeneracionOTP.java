package com.jomibusa.placetoplay.modelo.consumo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeneracionOTP {

    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("provider")
    @Expose
    private String provider;

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

    @Override
    public String toString() {
        return "GeneracionOTP{" +
                "status=" + status +
                ", provider='" + provider + '\'' +
                '}';
    }
}
