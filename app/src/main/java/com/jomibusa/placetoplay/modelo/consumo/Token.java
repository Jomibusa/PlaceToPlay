package com.jomibusa.placetoplay.modelo.consumo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Token {

    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("subtoken")
    @Expose
    private String subtoken;
    @SerializedName("franchise")
    @Expose
    private String franchise;
    @SerializedName("franchiseName")
    @Expose
    private String franchiseName;
    @SerializedName("issuerName")
    @Expose
    private String issuerName;
    @SerializedName("lastDigits")
    @Expose
    private String lastDigits;
    @SerializedName("validUntil")
    @Expose
    private String validUntil;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSubtoken() {
        return subtoken;
    }

    public void setSubtoken(String subtoken) {
        this.subtoken = subtoken;
    }

    public String getFranchise() {
        return franchise;
    }

    public void setFranchise(String franchise) {
        this.franchise = franchise;
    }

    public String getFranchiseName() {
        return franchiseName;
    }

    public void setFranchiseName(String franchiseName) {
        this.franchiseName = franchiseName;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public String getLastDigits() {
        return lastDigits;
    }

    public void setLastDigits(String lastDigits) {
        this.lastDigits = lastDigits;
    }

    public String getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }

    @Override
    public String toString() {
        return "Token{" +
                "token='" + token + '\'' +
                ", subtoken='" + subtoken + '\'' +
                ", franchise='" + franchise + '\'' +
                ", franchiseName='" + franchiseName + '\'' +
                ", issuerName='" + issuerName + '\'' +
                ", lastDigits='" + lastDigits + '\'' +
                ", validUntil='" + validUntil + '\'' +
                '}';
    }
}
