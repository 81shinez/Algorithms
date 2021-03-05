package com.algo.kit.binarySearch.immigrationCheck;

public class ImmigrationCheck {
    private ImmigrationCheck(){}

    private static class InnerInstance{
        private static final Solution solution = new Solution();
    }

    public static long execute(int n, int[] times){
        return InnerInstance.solution.solution(n, times);
    }
}
