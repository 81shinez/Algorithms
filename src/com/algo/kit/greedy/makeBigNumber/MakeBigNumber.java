package com.algo.kit.greedy.makeBigNumber;

public class MakeBigNumber {
    private MakeBigNumber(){}
    private static class InnerInstance{private static final Solution solution = new Solution();}
    public static String execute(String number, int k){return InnerInstance.solution.solution(number, k);}
}
