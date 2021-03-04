package com.jomibusa.placetoplay.modelo.Request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jomibusa.placetoplay.modelo.consumo.Credit;

public class Instrument {

    @SerializedName("card")
    @Expose
    private Card card;
    @SerializedName("credit")
    @Expose
    private Credit credit;
    @SerializedName("otp")
    @Expose
    private String otp;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

}
