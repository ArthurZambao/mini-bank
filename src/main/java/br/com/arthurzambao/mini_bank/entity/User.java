package br.com.arthurzambao.mini_bank.entity;

import br.com.arthurzambao.mini_bank.enums.Role;

import java.time.Instant;
import java.util.UUID;

public class User {

    private UUID id;
    private String name;
    private String email;
    private String passwordHash;
    private Role role;
    private Instant createdAt;
}
