package org.example.Entities;

public class PaymentInfo {
    private String id;
    private PaymentMethode paymentMethod;
    private String transactionId;

    public PaymentInfo() {
    }

    public PaymentInfo(String id, PaymentMethode paymentMethod, String transactionId) {
        this.id = id;
        this.paymentMethod = paymentMethod;
        this.transactionId = transactionId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PaymentMethode getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethode paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}

