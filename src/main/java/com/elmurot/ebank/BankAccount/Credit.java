package com.elmurot.ebank.BankAccount;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Credit {
    private String id;
    private double amount;
    private String description;
}
