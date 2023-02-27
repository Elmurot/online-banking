package com.elmurot.ebank.AccountOperation;

import com.elmurot.ebank.Enums.OperationType;
import com.elmurot.ebank.BankAccount.BankAccountDto;
import lombok.Data;

import java.util.Date;

@Data
public class AccountOperationDto {
    private BankAccountDto bankAccountDto;
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
}
