package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {4, 15, 8, 4, 3, 13, 8, 6, 34, 45, 21};
        long expected = 45;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}