package com.elmurot.ebank.Customer;

import com.elmurot.ebank.BankAccount.BankAccountEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class CustomerEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )

    private long id;
    private String name;
    private String email;
    @OneToMany(cascade= {CascadeType.PERSIST, CascadeType.REMOVE},mappedBy = "customer")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<BankAccountEntity> bankAccounts;
}
