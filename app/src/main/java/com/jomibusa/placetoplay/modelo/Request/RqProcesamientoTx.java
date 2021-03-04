package com.jomibusa.placetoplay.modelo.Request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jomibusa.placetoplay.modelo.consumo.Additional;

public class RqProcesamientoTx {

    @SerializedName("auth")
    @Expose
    private Auth auth;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("payment")
    @Expose
    private Payment payment;
    @SerializedName("ipAddress")
    @Expose
    private String ipAddress;
    @SerializedName("userAgent")
    @Expose
    private String userAgent;
    @SerializedName("additional")
    @Expose
    private Additional additional;
    @SerializedName("instrument")
    @Expose
    private Instrument instrument;
    @SerializedName("payer")
    @Expose
    private Payer payer;
    @SerializedName("buyer")
    @Expose
    private Buyer buyer;

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Additional getAdditional() {
        return additional;
    }

    public void setAdditional(Additional additional) {
        this.additional = additional;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Payer getPayer() {
        return payer;
    }

    public void setPayer(Payer payer) {
        this.payer = payer;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

}
