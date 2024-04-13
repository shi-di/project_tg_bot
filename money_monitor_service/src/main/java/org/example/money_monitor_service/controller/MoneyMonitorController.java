package org.example.money_monitor_service.controller;

import lombok.RequiredArgsConstructor;
import org.example.money_monitor_service.service.MoneyMonitorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/money")
@RequiredArgsConstructor
public class MoneyMonitorController {

    private final MoneyMonitorService moneyMonitorService;

    @GetMapping
    public ResponseEntity getAllTransaction(){
        return ResponseEntity.ok(moneyMonitorService.getAllTransaction());
    }

}
