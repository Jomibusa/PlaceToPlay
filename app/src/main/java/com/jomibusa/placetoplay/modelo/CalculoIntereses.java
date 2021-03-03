package com.jomibusa.placetoplay.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CalculoIntereses {

    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("provider")
    @Expose
    private String provider;
    @SerializedName("values")
    @Expose
    private Values values;
    @SerializedName("conversion")
    @Expose
    private Object conversion;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Values getValues() {
        return values;
    }

    public void setValues(Values values) {
        this.values = values;
    }

    public Object getConversion() {
        return conversion;
    }

    public void setConversion(Object conversion) {
        this.conversion = conversion;
    }

    @Override
    public String toString() {
        return "CalculoIntereses{" +
                "status=" + status +
                ", provider='" + provider + '\'' +
                ", values=" + values +
                ", conversion=" + conversion +
                '}';
    }
}
