package com.elmurot.ebank.AccountOperation;

import com.elmurot.ebank.BankAccount.BankService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class AccountOperationRestController {
    private BankService bankService;
    @GetMapping("/getallaccountoperation/{id}")
    public List<AccountOperationDto> getAllAccountOperation(@PathVariable(name = "id") String bankAccountId){
        return bankService.getAllAccountOperation(bankAccountId);
    }
    @GetMapping("/getaccountoperationInPage/{id}")
    public HistoryDto getAllAccountOperation(@PathVariable(name = "id") String bankAccountId,
          @RequestParam(name="page",defaultValue = "0") int page,
          @RequestParam(name = "size", defaultValue = "3") int size){
        return bankService.getAccountOperationInPage(bankAccountId,page,size);
    }

}
