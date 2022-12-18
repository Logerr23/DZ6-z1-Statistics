package ru.netology.stats;

public class StatsService {

    public int sumOfAllSales(int[] sales) {
        int sumSales = 0;
        for (int s : sales) {
            sumSales = sumSales + s;
        }
        return sumSales;
    }

    public int averageSalesAmount(int[] sales) {
        int averageAmount = sumOfAllSales(sales) / sales.length;
        return averageAmount;
    }

    public int monthOfMaxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthOfMinSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int numberOfMonthsOfLowSales(int[] sales) {
        int monthsLowSales = 0;
        for (int sale : sales) {
            if (sale < averageSalesAmount(sales)) {       // только месяцы с продажами ниже срежнего
                monthsLowSales++;
            }
        }
        return monthsLowSales;
    }

    public int numberOfMonthsOfHighSales(int[] sales) {
        int monthsHighSales = 0;
        for (int sale : sales) {
            if (sale <= averageSalesAmount(sales)) {       // месяцы с продажами равными и выше срежнего (чтобы они тоже входили в статистику)
                monthsHighSales++;
            }
        }
        return monthsHighSales;
    }

}
