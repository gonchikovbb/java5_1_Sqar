package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'OneHundred',100,200,4",
            "'TwoHundred',100,300,7",
            "'MaximumRange',90,10000,89",
            "'MinimumRange',90,110,1",
            "'Zero',90,100,0"})
    void shouldNumberSqrt(String name, int num1, int num2, int expected) {
        SQRService sqrService = new SQRService();
        int actual = sqrService.sqrtErect(num1, num2);
        assertEquals(expected, actual);
    }


}