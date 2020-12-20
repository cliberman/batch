package com.example.batch.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

    @InjectMocks
    Calculator calculator;

    @Test
    public void add_returnsTwo_whenOneAndOneIsPassed() throws Exception {
        int expected = 2;
        int actual = calculator.add(1, 1);
        assertThat(actual).isEqualTo(expected);
    }

}