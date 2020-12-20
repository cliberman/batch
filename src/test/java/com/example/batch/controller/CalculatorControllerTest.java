package com.example.batch.controller;

import com.example.batch.service.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CalculatorControllerTest {
    @Mock
    private Calculator mockCalculator;

    @InjectMocks
    private CalculatorController calculatorController;

    @Test
    public void add_shouldCallService_andReturnItsResult() {
        when(mockCalculator.add(anyInt(), anyInt())).thenReturn(2);

        verify(mockCalculator).add(eq(2), eq(3));

        assertThat(calculatorController.add(2, 3)).isEqualTo(2);
    }

}