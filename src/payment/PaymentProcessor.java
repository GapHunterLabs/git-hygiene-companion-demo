package com.acmecorp.payment;

import java.math.BigDecimal;

public class PaymentProcessor {

    private static final BigDecimal MAX_CHARGE = BigDecimal.valueOf(50_000);

    public BigDecimal charge(String customerId, BigDecimal amount) {
        validate(amount);
        return amount;
    }

    public RefundHandler refundHandlerFor(String customerId) {
        return new RefundHandler(customerId);
    }

    private void validate(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (amount.compareTo(MAX_CHARGE) > 0) {
            throw new IllegalArgumentException("Amount exceeds maximum single charge");
        }
    }
}
