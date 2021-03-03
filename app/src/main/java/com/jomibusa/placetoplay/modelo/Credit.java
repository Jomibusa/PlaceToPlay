package com.jomibusa.placetoplay.modelo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Credit {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("groupCode")
    @Expose
    private String groupCode;
    @SerializedName("installments")
    @Expose
    private List<Integer> installments = null;
    @SerializedName("installment")
    @Expose
    private Integer installment;
    @SerializedName("description")
    @Expose
    private String description;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public List<Integer> getInstallments() {
        return installments;
    }

    public void setInstallments(List<Integer> installments) {
        this.installments = installments;
    }

    public Integer getInstallment() {
        return installment;
    }

    public void setInstallment(Integer installment) {
        this.installment = installment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "code=" + code +
                ", type='" + type + '\'' +
                ", groupCode='" + groupCode + '\'' +
                ", installments=" + installments +
                ", installment=" + installment +
                ", description='" + description + '\'' +
                '}';
    }
}
