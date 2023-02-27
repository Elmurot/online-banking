package com.elmurot.ebank.BankAccount;

import com.elmurot.ebank.AccountOperation.AccountOperationDto;
import com.elmurot.ebank.AccountOperation.HistoryDto;
import com.elmurot.ebank.CurrentAccount.CurrentAccountEntity;
import com.elmurot.ebank.Customer.CustomerEntity;
import com.elmurot.ebank.Exceptions.BalanceNotSufficientException;
import com.elmurot.ebank.SavingAccount.SavingAccountEntity;
import com.elmurot.ebank.Customer.CustomerDto;
import com.elmurot.ebank.Exceptions.BankAccountException;
import com.elmurot.ebank.Exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankService {
    CustomerEntity saveCustomer(CustomerDto customer);
    CurrentAccountEntity saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    SavingAccountEntity saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    List<CustomerDto> getCustomers(String keyword);
    CustomerDto getCustomer(Long id);
    List<CustomerEntity> listCustomers();
    List<CustomerDto> listCustomersDto();
    BankAccountDto getBankAccount(String accountId) throws BankAccountException;
    void debit(Debit debit) throws BalanceNotSufficientException;
    void credit(Credit credit) throws BalanceNotSufficientException;
    void transfer(Transfer transfer) throws BalanceNotSufficientException;
    List<BankAccountEntity> listBankAccount();
    CustomerDto updateCustomer(Long id, CustomerDto customerDto) throws CustomerNotFoundException;
    void deleteCustomer(Long customerId);
    List<BankAccountDto> getAllbankaccounts();
    void deleteBankAccount(String bankAccountd);
    List<AccountOperationDto> getAllAccountOperation(String bankAccountId);
    HistoryDto getAccountOperationInPage(String bankAccountId, int page, int size);
    List<BankAccountDto> getAllbankaccountsOfUser(Long id);
}
