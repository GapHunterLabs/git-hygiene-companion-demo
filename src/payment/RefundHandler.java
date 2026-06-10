package com.acmecorp.payment;

import java.math.BigDecimal;

public class RefundHandler {

    private final String customerId;

    public RefundHandler(String customerId) {
        this.customerId = customerId;
    }

    public BigDecimal refund(BigDecimal originalCharge, BigDecimal refundAmount) {
        if (refundAmount.compareTo(originalCharge) > 0) {
            throw new IllegalArgumentException("Refund cannot exceed original charge");
        }
        return refundAmount;
    }
}
