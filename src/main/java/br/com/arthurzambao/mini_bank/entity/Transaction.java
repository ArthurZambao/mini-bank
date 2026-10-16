package br.com.arthurzambao.mini_bank.entity;

import br.com.arthurzambao.mini_bank.enums.TransactionType;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public class Transaction {

    private UUID id;
    private TransactionType type;
    private Account sourceAccount;
    private Account targetAccount;
    private BigDecimal amount;
    private String description;
    private String idempotencyKey;
    private Instant createdAt;
}
