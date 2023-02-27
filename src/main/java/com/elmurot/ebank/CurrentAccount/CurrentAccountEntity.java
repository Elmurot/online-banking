package com.elmurot.ebank.CurrentAccount;

import com.elmurot.ebank.BankAccount.BankAccountEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CURR")
@Data
@AllArgsConstructor @NoArgsConstructor
public class CurrentAccountEntity extends BankAccountEntity {
    private double overDraft;
}
