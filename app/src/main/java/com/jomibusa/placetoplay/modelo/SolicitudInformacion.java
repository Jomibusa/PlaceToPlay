package com.jomibusa.placetoplay.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SolicitudInformacion {

    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("provider")
    @Expose
    private String provider;
    @SerializedName("cardTypes")
    @Expose
    private List<String> cardTypes = null;
    @SerializedName("displayInterest")
    @Expose
    private Boolean displayInterest;
    @SerializedName("requireOtp")
    @Expose
    private Boolean requireOtp;
    @SerializedName("requireCvv2")
    @Expose
    private Boolean requireCvv2;
    @SerializedName("threeDS")
    @Expose
    private String threeDS;
    @SerializedName("credits")
    @Expose
    private List<Credit> credits = null;

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

    public List<String> getCardTypes() {
        return cardTypes;
    }

    public void setCardTypes(List<String> cardTypes) {
        this.cardTypes = cardTypes;
    }

    public Boolean getDisplayInterest() {
        return displayInterest;
    }

    public void setDisplayInterest(Boolean displayInterest) {
        this.displayInterest = displayInterest;
    }

    public Boolean getRequireOtp() {
        return requireOtp;
    }

    public void setRequireOtp(Boolean requireOtp) {
        this.requireOtp = requireOtp;
    }

    public Boolean getRequireCvv2() {
        return requireCvv2;
    }

    public void setRequireCvv2(Boolean requireCvv2) {
        this.requireCvv2 = requireCvv2;
    }

    public String getThreeDS() {
        return threeDS;
    }

    public void setThreeDS(String threeDS) {
        this.threeDS = threeDS;
    }

    public List<Credit> getCredits() {
        return credits;
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "SolicitudInformacion{" +
                "status=" + status +
                ", provider='" + provider + '\'' +
                ", cardTypes=" + cardTypes +
                ", displayInterest=" + displayInterest +
                ", requireOtp=" + requireOtp +
                ", requireCvv2=" + requireCvv2 +
                ", threeDS='" + threeDS + '\'' +
                ", credits=" + credits +
                '}';
    }
}
