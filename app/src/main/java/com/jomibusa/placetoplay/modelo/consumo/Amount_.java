package com.jomibusa.placetoplay.modelo.consumo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Amount_ {

    @SerializedName("taxes")
    @Expose
    private List<Tax> taxes = null;
    @SerializedName("details")
    @Expose
    private List<Detail> details = null;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("total")
    @Expose
    private String total;

    public List<Tax> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<Tax> taxes) {
        this.taxes = taxes;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "AmountConsulta{" +
                "taxes=" + taxes +
                ", details=" + details +
                ", currency='" + currency + '\'' +
                ", total='" + total + '\'' +
                '}';
    }
}
