package com.jomibusa.placetoplay.modelo.consumo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Transaction {

    @SerializedName("status")
    @Expose
    private Status_ status;
    @SerializedName("internalReference")
    @Expose
    private Integer internalReference;
    @SerializedName("reference")
    @Expose
    private String reference;
    @SerializedName("paymentMethod")
    @Expose
    private String paymentMethod;
    @SerializedName("franchise")
    @Expose
    private String franchise;
    @SerializedName("franchiseName")
    @Expose
    private String franchiseName;
    @SerializedName("issuerName")
    @Expose
    private String issuerName;
    @SerializedName("amount")
    @Expose
    private Amount amount;
    @SerializedName("conversion")
    @Expose
    private Conversion conversion;
    @SerializedName("authorization")
    @Expose
    private String authorization;
    @SerializedName("receipt")
    @Expose
    private Integer receipt;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("refunded")
    @Expose
    private Boolean refunded;
    @SerializedName("lastDigits")
    @Expose
    private String lastDigits;
    @SerializedName("provider")
    @Expose
    private String provider;
    @SerializedName("discount")
    @Expose
    private Object discount;
    @SerializedName("processorFields")
    @Expose
    private List<Object> processorFields = null;
    @SerializedName("additional")
    @Expose
    private Additional additional;

    public Status_ getStatus() {
        return status;
    }

    public void setStatus(Status_ status) {
        this.status = status;
    }

    public Integer getInternalReference() {
        return internalReference;
    }

    public void setInternalReference(Integer internalReference) {
        this.internalReference = internalReference;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getFranchise() {
        return franchise;
    }

    public void setFranchise(String franchise) {
        this.franchise = franchise;
    }

    public String getFranchiseName() {
        return franchiseName;
    }

    public void setFranchiseName(String franchiseName) {
        this.franchiseName = franchiseName;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Conversion getConversion() {
        return conversion;
    }

    public void setConversion(Conversion conversion) {
        this.conversion = conversion;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public Integer getReceipt() {
        return receipt;
    }

    public void setReceipt(Integer receipt) {
        this.receipt = receipt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRefunded() {
        return refunded;
    }

    public void setRefunded(Boolean refunded) {
        this.refunded = refunded;
    }

    public String getLastDigits() {
        return lastDigits;
    }

    public void setLastDigits(String lastDigits) {
        this.lastDigits = lastDigits;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Object getDiscount() {
        return discount;
    }

    public void setDiscount(Object discount) {
        this.discount = discount;
    }

    public List<Object> getProcessorFields() {
        return processorFields;
    }

    public void setProcessorFields(List<Object> processorFields) {
        this.processorFields = processorFields;
    }

    public Additional getAdditional() {
        return additional;
    }

    public void setAdditional(Additional additional) {
        this.additional = additional;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "status=" + status +
                ", internalReference=" + internalReference +
                ", reference='" + reference + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", franchise='" + franchise + '\'' +
                ", franchiseName='" + franchiseName + '\'' +
                ", issuerName='" + issuerName + '\'' +
                ", amount=" + amount +
                ", conversion=" + conversion +
                ", authorization='" + authorization + '\'' +
                ", receipt=" + receipt +
                ", type='" + type + '\'' +
                ", refunded=" + refunded +
                ", lastDigits='" + lastDigits + '\'' +
                ", provider='" + provider + '\'' +
                ", discount=" + discount +
                ", processorFields=" + processorFields +
                ", additional=" + additional +
                '}';
    }
}
