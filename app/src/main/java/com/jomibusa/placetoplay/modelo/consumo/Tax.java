package com.jomibusa.placetoplay.modelo.consumo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tax {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("amount")
    @Expose
    private Double amount;
    @SerializedName("base")
    @Expose
    private Integer base;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Tax{" +
                "kind='" + kind + '\'' +
                ", amount=" + amount +
                ", base=" + base +
                '}';
    }
}
