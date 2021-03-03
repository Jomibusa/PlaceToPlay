package com.jomibusa.placetoplay.modelo.consumo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class From {

    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("total")
    @Expose
    private Double total;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "From{" +
                "currency='" + currency + '\'' +
                ", total=" + total +
                '}';
    }
}
