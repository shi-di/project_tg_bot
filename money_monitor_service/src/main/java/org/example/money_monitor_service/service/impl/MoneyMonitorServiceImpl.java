package org.example.money_monitor_service.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.money_monitor_service.dto.TransactionDTO;
import org.example.money_monitor_service.mapper.TransactionMapper;
import org.example.money_monitor_service.repository.TransactionRepository;
import org.example.money_monitor_service.service.MoneyMonitorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MoneyMonitorServiceImpl implements MoneyMonitorService {

    private final TransactionMapper transactionMapper;
    private final TransactionRepository transactionRepository;
    @Override
    public List<TransactionDTO> getAllTransaction() {
        List<TransactionDTO> transactions = transactionRepository.getAllTransactionEntities().stream()
                .map(transactionMapper::transactionEntityToTransactionDTO)
                .collect(Collectors.toList());
        return transactions;
    }
}
