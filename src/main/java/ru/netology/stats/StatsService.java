package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;

        }
        return sum;
    }

    public int calculateSumAverage(int[] purchases) {
        int averege = 0;
        for (int purchase : purchases) {
            averege = purchase;
        }
        return averege;
    }

    public int findMax(int[] purchases) {
        int monthMax = purchases[0];
        for (int purchase : purchases) {
            if (monthMax < purchase) {
                monthMax = purchase;
            }
        }
        return monthMax;
    }

    public int findMin(int[] purchases) {
        int monthMin = purchases[0];
        for (int purchase : purchases) {
            if (monthMin > purchase) {
                monthMin = purchase;
            }
        }
        return monthMin;
    }

    public int findMaxUnderAverage(int[] purchases) {
        int sellUnder = purchases[0];
        int average = 15;
        for (int purchase : purchases) {
            if (sellUnder < purchase) {
                sellUnder = purchase;
            }
        }
        return sellUnder;
    }

    public int findMaxOverAverage(int[] purchases) {
        int sellOver = purchases[0];
        int average = 15;
        for (int purchase : purchases) {
            if (sellOver > purchase) {
                sellOver = purchase;
            }
        }
        return sellOver;
    }
}
