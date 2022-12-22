package ru.netology.stats;

public class StatsService {

    public long sumOfAllSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    public long averageSalesAmount(long[] sales) {
        long averageAmount = sumOfAllSales(sales) / sales.length;
        return averageAmount;
    }

    public int monthOfMaxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthOfMinSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsOfLowSales(long[] sales) {
        int monthsLowSales = 0;
        long averageAmount = averageSalesAmount(sales);
        for (long sale : sales) {
            if (sale < averageAmount) {
                monthsLowSales++;
            }
        }
        return monthsLowSales;
    }

    public int monthsOfHighSales(long[] sales) {
        int monthsHighSales = 0;
        long averageAmount = averageSalesAmount(sales);
        for (long sale : sales) {
            if (sale < averageAmount) {
                monthsHighSales++;
            }
        }
        return monthsHighSales;
    }

}
