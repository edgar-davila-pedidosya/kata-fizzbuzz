package com.pedidosya.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void oneMustReturnOne() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // When
        String result = fizzBuzz.calc(1);

        // Then
        Assertions.assertEquals("1", result);
    }
}
