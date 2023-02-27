package com.elmurot.ebank.AccountOperation;

import lombok.Data;

import java.util.List;

@Data
public class HistoryDto {
    private List<AccountOperationDto> accountOperationDtoList;
    private int currentPage;
    private int sizePage;
    private int totalPages;

}