package com.jomibusa.placetoplay.modelo.consumo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Detail {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("amount")
    @Expose
    private String amount;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "kind='" + kind + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
