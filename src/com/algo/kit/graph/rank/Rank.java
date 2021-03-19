package com.algo.kit.graph.rank;

public class Rank {
    private Rank(){}
    private static class InnerClass{private static final Solution solution = new Solution();}
    public static int execute(int n, int[][] results){return InnerClass.solution.solution(n, results);}
}
