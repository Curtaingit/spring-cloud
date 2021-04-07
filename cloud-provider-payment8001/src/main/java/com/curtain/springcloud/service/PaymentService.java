package com.curtain.springcloud.service;

import com.curtain.springcloud.entities.Payment;

/**
 * @author Curtain
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
