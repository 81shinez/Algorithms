package com.algo.kit.bruteForce.findingPrimeNumber;

public class FindingPrimeNumber {
    private FindingPrimeNumber(){}

    private static class InnerInstance {
        private static final Solution solution = new Solution();
    }

    public static int execute(String numbers){
        return InnerInstance.solution.solution(numbers);
    }
}