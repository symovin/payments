package com.epam.payments.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    private int paymentId;
    private BigDecimal paymentSum;
    private String description;
    private Timestamp paymentDateTime;

    @ManyToOne
    @JoinColumn(name = "payment_state")
    private PaymentState paymentState;

    @ManyToOne
    @JoinColumn(name = "payment_type")
    private PaymentType paymentType;
}
