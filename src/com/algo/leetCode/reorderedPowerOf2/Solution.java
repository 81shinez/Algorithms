package com.algo.leetCode.reorderedPowerOf2;

class Solution {
    boolean permutation(String prefix, String str){
        if(str.length() == 0) {
            if ((Integer.parseInt(prefix) | Integer.highestOneBit((Integer.parseInt(prefix))) )== Integer.highestOneBit((Integer.parseInt(prefix)))) return true;
        }
        for(int idx = 0; idx < str.length(); idx++){
            if (!prefix.startsWith("0")) {
                if (permutation(prefix + str.charAt(idx), str.substring(0, idx) + str.substring(idx + 1)))
                    return true;
            }
        }
        return false;
    }

    public boolean reorderedPowerOf2(int N) {
        String str = String.valueOf(N);
        return permutation("", str);

    }
}

// 모범답안
//
//class Solution {
//    public boolean reorderedPowerOf2(int N) {
//        int[] A = count(N);
//        for (int i = 0; i < 31; ++i)
//            if (Arrays.equals(A, count(1 << i)))
//                return true;
//        return false;
//    }
//
//    // Returns the count of digits of N
//    // Eg. N = 112223334, returns [0,2,3,3,1,0,0,0,0,0]
//    public int[] count(int N) {
//        int[] ans = new int[10];
//        while (N > 0) {
//            ans[N % 10]++;
//            N /= 10;
//        }
//        return ans;
//    }
//}