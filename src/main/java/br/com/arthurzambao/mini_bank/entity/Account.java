package br.com.arthurzambao.mini_bank.entity;

import br.com.arthurzambao.mini_bank.enums.AccountStatus;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public class Account {
    private UUID id;
    private String number;
    private User owner;
    private BigDecimal balance;
    private AccountStatus status;
    private Long version;
    private Instant createdAt;
}
