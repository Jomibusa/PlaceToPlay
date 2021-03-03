package com.jomibusa.placetoplay.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Values {

    @SerializedName("original")
    @Expose
    private Double original;
    @SerializedName("installment")
    @Expose
    private Integer installment;
    @SerializedName("interest")
    @Expose
    private Double interest;
    @SerializedName("total")
    @Expose
    private Double total;

    public Double getOriginal() {
        return original;
    }

    public void setOriginal(Double original) {
        this.original = original;
    }

    public Integer getInstallment() {
        return installment;
    }

    public void setInstallment(Integer installment) {
        this.installment = installment;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Values{" +
                "original=" + original +
                ", installment=" + installment +
                ", interest=" + interest +
                ", total=" + total +
                '}';
    }
}
