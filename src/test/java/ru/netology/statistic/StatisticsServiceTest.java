package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }


    @Test
    void maxWithOtherData() {
        StatisticsService service2 = new StatisticsService();

        long[] incomesInBillions = {4, 15, 8, 4, 3, 13, 8, 6, 34, 45, 21};
        long expected = 45;

        long actual = service2.maxWithOtherData(incomesInBillions);

        assertEquals(expected, actual);
    }
}