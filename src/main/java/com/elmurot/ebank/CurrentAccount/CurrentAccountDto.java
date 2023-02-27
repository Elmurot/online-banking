package com.elmurot.ebank.CurrentAccount;

import com.elmurot.ebank.BankAccount.BankAccountDto;
import lombok.Data;

@Data
public class CurrentAccountDto extends BankAccountDto {
    private double overDraft;
}
