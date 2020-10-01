package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;

        }
        return sum;
    }

    public int calculateAverage(int[] purchases) {
        int average = calculateSum(purchases) / purchases.length;

        return average;
    }

    public int MaxMonthPurchases(int[] purchases) {
        int currentMaxPurchasesMonth = 1;
        int currentMax = purchases[0];
        for(int i = 1; i < purchases.length; i++) {
            if (purchases[i] >= currentMax) {
                currentMax = purchases[i];
                currentMaxPurchasesMonth = i + 1;
            }
        }
        return currentMaxPurchasesMonth;
    }

    public int MinMonthPurchases(int[] purchases) {
        int currentMinPurchasesMonth = 1;
        int currentMin = purchases[0];
        for(int i = 1; i < purchases.length; i++) {
            if (purchases[i] <= currentMin) {
                currentMin = purchases[i];
                currentMinPurchasesMonth = i + 1;
            }
        }
        return currentMinPurchasesMonth;
    }

    public int MonthsAmountWithPurchasesLowerAverage(int[] purchases) {
        int monthsAmount = 0;
        for (int monthSale : purchases) {
            if (monthSale < calculateAverage(purchases)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }

    public int MonthsAmountWithPurchasesHigherAverage(int[] purchases) {
        int monthsAmount = 0;
        for (int monthSale : purchases) {
            if (monthSale > calculateAverage(purchases)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }
}
