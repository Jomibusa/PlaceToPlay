package com.jomibusa.placetoplay.modelo.consumo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ValidacionOTP {

    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("provider")
    @Expose
    private String provider;
    @SerializedName("signature")
    @Expose
    private String signature;
    @SerializedName("validated")
    @Expose
    private Boolean validated;

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

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Boolean getValidated() {
        return validated;
    }

    public void setValidated(Boolean validated) {
        this.validated = validated;
    }

    @Override
    public String toString() {
        return "ValidacionOTP{" +
                "status=" + status +
                ", provider='" + provider + '\'' +
                ", signature='" + signature + '\'' +
                ", validated=" + validated +
                '}';
    }
}
