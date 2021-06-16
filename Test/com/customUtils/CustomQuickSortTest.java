package com.customUtils;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomQuickSortTest {
    private static final int number = 12;
    private static int[] data;
    private static final int cnt = 0; // quick_sort 호출 횟수

    public static void printData(int[] data, int number) { for (int i = 0; i < number; i++) { System.out.print(data[i] + " "); } System.out.println(); }

    @Test
    void sort() {
        // 1~100 랜덤한 값 출력
        data = new int[number];
        for (int i = 0; i < number; i++) {
            data[i] = (int) (Math.random() * 8);
        }

        int[] compareArray = Arrays.copyOf(data, number);
        int[] reverseArray = Arrays.copyOf(data, number);
        Arrays.sort(compareArray);

        // 정렬 전
        printData(data, number);

        // 정렬 시작
        CustomQuickSort.sort(data, 0, number - 1);

        CustomQuickSort.reverseSort(reverseArray, 0, number - 1);

        // 정렬 후
        printData(data, number);
        printData(reverseArray, number);

        assertEquals(Arrays.toString(compareArray), Arrays.toString(data));
    }
}