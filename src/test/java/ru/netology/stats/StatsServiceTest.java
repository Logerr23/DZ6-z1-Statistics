package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void calculateTheAmountOfSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.sumOfAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.averageSalesAmount(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthOfMaximumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.monthOfMaxSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthOfMinimumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.monthOfMinSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);

    }

    @Test
    public void monthsOfLowSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonths = 5;
        int actualMinMonths = service.monthsOfLowSales(sales);

        Assertions.assertEquals(expectedMinMonths, actualMinMonths);

    }

    @Test
    public void monthsOfHighSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonths = 5;
        int actualMaxMonths = service.monthsOfHighSales(sales);

        Assertions.assertEquals(expectedMaxMonths, actualMaxMonths);

    }

}
