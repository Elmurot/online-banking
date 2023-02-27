package com.elmurot.ebank.BankAccount;

import com.elmurot.ebank.Enums.AccountStatus;
import com.elmurot.ebank.Customer.CustomerDto;
import lombok.Data;

import java.util.Date;

@Data
public class BankAccountDto {
    private CustomerDto customerDto;
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
}
