package com.elmurot.ebank.SavingAccount;

import com.elmurot.ebank.BankAccount.BankAccountEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SAVI")
@Data
@AllArgsConstructor @NoArgsConstructor
public class SavingAccountEntity extends BankAccountEntity {
    private double interestRate;
}
