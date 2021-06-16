package com.algo.kit.dynamicProgramming.expressWithN;

public class ExpressWithN {
    private ExpressWithN(){}

    private static class InnerInstance {
        private static final Solution solution = new Solution();
    }

    public static int execute(int N, int number){
        return InnerInstance.solution.solution(N, number);
    }
}
