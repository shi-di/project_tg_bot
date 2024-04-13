package org.example.money_monitor_service.service;

import jakarta.transaction.Transaction;
import org.example.money_monitor_service.dto.TransactionDTO;

import java.util.List;

public interface MoneyMonitorService {

    List<TransactionDTO> getAllTransaction();

}
