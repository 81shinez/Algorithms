package com.customUtils;

public class CustomBinarySearch {
    /*
    params: int[] 정렬된배열, int 목표값
    return: 목표값의 배열 인덱스
     */
    public static int binarySearch(int[] intArray, int target) {
        int leftIdx = 0;
        int rightIdx = intArray.length - 1;
        int midIdx;
        int rtnVal = -1;

        while(leftIdx <= rightIdx){
            midIdx = (leftIdx + rightIdx) / 2;
            rtnVal = midIdx;
            System.out.println("rtnVal: "+rtnVal);
            if(intArray[midIdx] == target) {
                break;
            }
            if(intArray[midIdx] < target) leftIdx = midIdx+1;
            if(intArray[midIdx] > target) rightIdx = midIdx-1;
        }
        return rtnVal;
    }
}
