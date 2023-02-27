package com.elmurot.ebank.AccountOperation;

import com.elmurot.ebank.BankAccount.BankAccountEntity;
import com.elmurot.ebank.Enums.OperationType;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class AccountOperationEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date operationDate;
    private double amount;
    @Enumerated(EnumType.STRING)
    private OperationType type;
    @ManyToOne
    private BankAccountEntity bankAccountEntity;
}
