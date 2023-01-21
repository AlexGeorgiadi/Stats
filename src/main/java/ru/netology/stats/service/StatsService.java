package ru.netology.stats.service;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int sum = sumSales(sales);
        int average = sum / sales.length;
        return average;
    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        int maxMonthNumber = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
                maxMonthNumber = maxMonth + 1;
            }
        }
        return maxMonthNumber;
    }

    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        int minMonthNumber = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
                minMonthNumber = minMonth + 1;
            }
        }
        return minMonthNumber;
    }

    public int getSumOfMonthsBelowAverage(int[] sales) {
        int sum = 0;
        int average = averageSales(sales);
        int months = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                months = months + 1;
            }
        }
        return months;
    }

    public int getSumOfMonthsAboveAverage(int[] sales) {
        int sum = 0;
        int average = averageSales(sales);
        int months = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                months = months + 1;
            }
        }
        return months;
    }
}
