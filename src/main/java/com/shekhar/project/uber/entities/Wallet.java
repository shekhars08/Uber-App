package com.shekhar.project.uber.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    private double balance;

    @OneToMany(mappedBy = "wallet")
    private List<WalletTransaction> transactions;
}