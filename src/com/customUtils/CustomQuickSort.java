package com.customUtils;

public class CustomQuickSort {
    private static void arrSwap(int[] intArray, int idxLeft, int idxRight){
        int swapVal = intArray[idxLeft];
        intArray[idxLeft] = intArray[idxRight];
        intArray[idxRight] = swapVal;
    }
    /*
    params: int[] 정렬대상배열, int 시작인덱스, end 끝인덱스
    return: int[] 정렬된 배열
     */
    public static void sort(int[] intArray, int start, int end){
        double pivot = (intArray[start] + intArray[end])/2;
        int left = start;
        int right = end;
        while (left <= right){
            while(intArray[left] < pivot) left++;
            while(intArray[right] > pivot) right--;
            if(left <= right){
                arrSwap(intArray, left, right);
                left++;
                right--;
            }
        }
        if(start < right) sort(intArray, start, right);
        if(left < end) sort(intArray, left, end);
    }

    /*
    params: int[] 역정렬대상배열, int 시작인덱스, end 끝인덱스
    return: int[] 역정렬된 배열
     */
    public static void reverseSort(int[] intArray, int start, int end){
        double pivot = (intArray[start] + intArray[end]) / 2;
        int leftIdx = start;
        int rightIdx = end;

        while(leftIdx <= rightIdx){
            while(pivot < intArray[leftIdx]) leftIdx++;
            while(pivot > intArray[rightIdx]) rightIdx--;
            if(leftIdx <= rightIdx){
                arrSwap(intArray, leftIdx, rightIdx);
                leftIdx++;
                rightIdx--;
            }
        }

        if(start < rightIdx) reverseSort(intArray, start, rightIdx);
        if(leftIdx < end) reverseSort(intArray, leftIdx, end);
    }


}
