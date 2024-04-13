package org.example.money_monitor_service.mapper;

import org.example.money_monitor_service.dto.TransactionDTO;
import org.example.money_monitor_service.entity.TransactionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

    public TransactionDTO transactionEntityToTransactionDTO(TransactionEntity transactionEntity);

}
