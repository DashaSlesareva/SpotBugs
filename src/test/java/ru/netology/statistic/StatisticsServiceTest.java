package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {


    @Test
    void findMaxFirstMassive() {
        StatisticsService service = new StatisticsService();
        long expected = 12;
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxSecondMassive() {
        StatisticsService service = new StatisticsService();
        long expected = 12;
        long[] incomesInBillions = {5, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

}