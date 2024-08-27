package ru.netology.stats;

public class StatsService {

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int calculateSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1;
    }

    public int averageAmount(int[] sales) {
        int averageAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[averageAmount]) {
                averageAmount = i;
            }
        }

        return averageAmount / 12;

    }

    public int belowAverageAmount(int[] sales) {
        int counter = 0;
        int average = averageAmount(sales);
        for (int sale : sales) {
            if (sale < average) {
                counter++;
            }
        }

        return counter;

    }

    public int aboveAverageAmount(int[] sales) {
        int counter = 0;
        int average = averageAmount(sales);
        for (int sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;

    }
}
