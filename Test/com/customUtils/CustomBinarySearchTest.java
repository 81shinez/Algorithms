package com.customUtils;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomBinarySearchTest {
    @Test
    void binarySearch() {
        // 1~100 랜덤한 값 출력
        int[] evenArray = new int[]{0,1,2,3,4,5,6,7,8,9};
        int[] oddArray = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        assertEquals(3, CustomBinarySearch.binarySearch(evenArray,3));
        System.out.println("-----------");
        assertEquals(4, CustomBinarySearch.binarySearch(oddArray,4));
    }
}