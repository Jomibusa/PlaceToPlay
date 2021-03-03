package com.jomibusa.placetoplay.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BusquedaTransacciones {

    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("transactions")
    @Expose
    private List<Transaction> transactions = null;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "BusquedaTransacciones{" +
                "status=" + status +
                ", transactions=" + transactions +
                '}';
    }
}
