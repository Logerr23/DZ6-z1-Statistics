package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void calculateTheAmountOfSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumOfAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void calculateAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSum = 15;
        int actualAverageSum = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);

    }

    @Test
    public void monthOfMaximumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.monthOfMaxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);

    }

    @Test
    public void monthOfMinimumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.monthOfMinSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);

    }

    @Test
    public void monthsOfLowSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonths = 9;
        int actualMinMonths = service.numberOfMonthsOfLowSales(sales);

        Assertions.assertEquals(expectedMinMonths, actualMinMonths);

    }

    @Test
    public void monthsOfHighSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonths = 7;
        int actualMaxMonths = service.numberOfMonthsOfHighSales(sales);

        Assertions.assertEquals(expectedMaxMonths, actualMaxMonths);

    }

}
