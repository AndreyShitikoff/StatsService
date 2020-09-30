package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void testCalculateSum() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }

        @Test
    void testCalculateSumAverage() {
        StatsService service = new StatsService();
        int[] purchases = {180 / 12};
        int expected = 15;
        int actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] monthMax = {6};
        int expected = 6;
        int actual = service.findMax(monthMax);

        assertEquals(expected, actual);
    }

    @Test
    void findMin() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] monthMin = {9};
        int expected = 9;
        int actual = service.findMax(monthMin);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxUnderAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] sellUnder = {5};
        int expected = 5;
        int actual = service.findMax(sellUnder);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxOverAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] sellOver = {5};
        int expected = 5;
        int actual = service.findMax(sellOver);

        assertEquals(expected, actual);
    }
}
