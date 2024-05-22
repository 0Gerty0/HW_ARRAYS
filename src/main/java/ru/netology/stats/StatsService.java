package ru.netology.stats;


public class StatsService {
    public long commonSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }


    public long averageSale(long[] sales) {
        if (sales.length == 0) {
            return 0;
        } else {
            return commonSales(sales) / sales.length;
        }
    }

    public int maximumSalesMonth(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = 1;
            }

        }
        return monthMaximum + 1;
    }

    public int minimumSalesMonth(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimum]) {
                monthMinimum = 1;
            }

        }
        return monthMinimum + 1;
    }

    public int calcNumberMonthBellowAverage(long[] sales) {
        int counter = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }

        }
        return counter;

    }

    public int calcNumberMonthHigherAverage(long[] sales) {
        int counter = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }

        }
        return counter;

    }


}