package org.example.money_monitor_service.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "transaction_table")
public class TransactionEntity {


    @Id
    @SequenceGenerator(name = "transaction_tableSequence", sequenceName = "transaction_table_sequence", allocationSize = 1, initialValue = 4)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_tableSequence")
    private Long id;

    @Column(name = "nameTransaction")
    private String nameTransaction;
    @Column(name = "countMoney")
    private int countMoney;
    @Column(name = "time")
    private LocalDateTime time;
    @Column(name = "category")
    private String category;

}
