package ru.netology.stats;

public class StatsService {


    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }

        return totalSale;
    }


    public long averege(long[]sales) {
        return sum(sales) / sales.length;
    }


    public int maxMonthSale(long[]sales){
        int monthMax = 0;
        long saleMax = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMax) {
                monthMax = i;
                saleMax = sales [i];
            }
        }

        return monthMax + 1;

    }

    public int minMonthSale(long[]sales){
        int monthMin = 0;
        long saleMax = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMax) {
                monthMin = i;
                saleMax = sales [i];
            }
        }

        return monthMin + 1;

    }

    public int monthsBellowAverege(long[]sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averege(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsAverege(long[]sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > averege(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
