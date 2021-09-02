package com.epam.payments.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cardId;
    private String cardNumber;
    private String cardIban;
    private BigDecimal cardBalance;
    private boolean block;
    private boolean request;

    @OneToMany
    @JoinColumn(name = "recipientCard")
    private List<Payment> recipientPayments;

    @OneToMany
    @JoinColumn(name = "senderCard")
    private List<Payment> senderPayments;
}
