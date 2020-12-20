package com.example.batch.controller;

import com.example.batch.service.Calculator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class CalculatorController {
    private final Calculator calculator;

    public int add(@PathVariable int a, @PathVariable int b) {
        return calculator.add(a, b);
    }
}
