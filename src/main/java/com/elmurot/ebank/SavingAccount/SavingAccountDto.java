package com.elmurot.ebank.SavingAccount;

import com.elmurot.ebank.BankAccount.BankAccountDto;
import lombok.Data;

@Data
public class SavingAccountDto extends BankAccountDto {
    private double interestRate;
}
