package ru.netology.stats.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCalculateAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldGetMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSalesMonth = 8;
        int actualMaxSalesMonth = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedMaxSalesMonth, actualMaxSalesMonth);
    }

    @Test
    public void shouldGetMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSalesMonth = 9;
        int actualMinSalesMonth = service.getMinMonth(sales);

        Assertions.assertEquals(expectedMinSalesMonth, actualMinSalesMonth);
    }

    @Test
    public void shouldGetSumOfMonthsBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsBelowAverage = 5;
        int actualMonthsBelowAverage = service.getSumOfMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedMonthsBelowAverage, actualMonthsBelowAverage);
    }

    @Test
    public void shouldGetSumOfMonthsAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsAboveAverage = 5;
        int actualMonthsAboveAverage = service.getSumOfMonthsAboveAverage(sales);

        Assertions.assertEquals(expectedMonthsAboveAverage, actualMonthsAboveAverage);
    }
}

