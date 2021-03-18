package com.algo.leetCode.wiggleSubsequence;

class Solution {
    public int wiggleMaxLength(int[] nums) {
        int ans = 0;
        boolean isGrowing =true;
        if(nums.length < 2) return nums.length;
        for(int idx = 1; idx < nums.length; idx++){
            if(nums[idx] > nums[idx-1]){
                if(isGrowing == false){
                    ans++;
                } else if(ans == 0) ans++;
                isGrowing = true;
            } else if (nums[idx] < nums[idx-1]){
                if(isGrowing == true){
                    ans++;
                } else if(ans == 0) ans++;
                isGrowing = false;
            }
        }
        return ans + 1;
    }
}