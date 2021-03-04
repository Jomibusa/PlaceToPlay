package com.jomibusa.placetoplay.modelo.Request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jomibusa.placetoplay.modelo.consumo.Detail;
import com.jomibusa.placetoplay.modelo.consumo.Tax;

import java.util.List;

public class Amount {

    @SerializedName("taxes")
    @Expose
    private List<Tax> taxes = null;
    @SerializedName("details")
    @Expose
    private List<Detail> details = null;
    @SerializedName("total")
    @Expose
    private Double total;
    @SerializedName("currency")
    @Expose
    private String currency;

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
