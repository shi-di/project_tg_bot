package org.example.money_monitor_service.repository;

import org.example.money_monitor_service.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {

    public List<TransactionEntity> getTransactionEntitiesById(Long id);

    @Query(value = "SELECT t FROM TransactionEntity t")
    List<TransactionEntity> getAllTransactionEntities();
}
