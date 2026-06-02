package com.acmecorp.payment;

import java.math.BigDecimal;

public class PaymentProcessor {

    public BigDecimal charge(String customerId, BigDecimal amount) {
        validate(amount);
        return amount;
    }

    private void validate(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }
}
