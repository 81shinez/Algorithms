package com.algo.kit.bruteForce.carpet;

public class Carpet {
    private Carpet(){};

    private static class InnerInstance {
        private static final Solution solution = new Solution();
    }

    public static int[] execute(int brown, int yellow){
        return InnerInstance.solution.solution(brown, yellow);
    }
}
