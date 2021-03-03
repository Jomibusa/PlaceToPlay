package com.jomibusa.placetoplay.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Additional {

    @SerializedName("credit")
    @Expose
    private Credit credit;
    @SerializedName("totalAmount")
    @Expose
    private Double totalAmount;
    @SerializedName("interestAmount")
    @Expose
    private Double interestAmount;
    @SerializedName("installmentAmount")
    @Expose
    private Integer installmentAmount;
    @SerializedName("iceAmount")
    @Expose
    private Integer iceAmount;

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(Double interestAmount) {
        this.interestAmount = interestAmount;
    }

    public Integer getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(Integer installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public Integer getIceAmount() {
        return iceAmount;
    }

    public void setIceAmount(Integer iceAmount) {
        this.iceAmount = iceAmount;
    }

    @Override
    public String toString() {
        return "Additional{" +
                "credit=" + credit +
                ", totalAmount=" + totalAmount +
                ", interestAmount=" + interestAmount +
                ", installmentAmount=" + installmentAmount +
                ", iceAmount=" + iceAmount +
                '}';
    }
}
