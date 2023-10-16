package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class FreeTimeServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")

    /* другой вариант передачи данных
     @CsvSource({
            "10000,3000,20000,3",
            "100000,60000,150000,2"
    }
*/
    public void testPositiveScenarios(int income, int expenses, int threshold, int expected) {
        FreeTimeService service = new FreeTimeService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
/*
    @Test
    public void testCalcThreeMonthsPositive(){
        FreeTimeService service = new FreeTimeService();

        //данные:
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;

        //метод:
        int actual = service.calculate(income, expenses, threshold);

        //проверка:
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcTwoMonthsPositive(){
        FreeTimeService service = new FreeTimeService();

        //данные:
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;

        //метод:
        int actual = service.calculate(income, expenses, threshold);

        //проверка:
        Assertions.assertEquals(expected, actual);
    }
*/
}