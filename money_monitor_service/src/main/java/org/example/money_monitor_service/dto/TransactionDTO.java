package org.example.money_monitor_service.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TransactionDTO {

    private String nameTransaction;
    private int countMoney;
    private LocalDateTime time;
    private String category;

}
