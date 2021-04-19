package com.algo.kit.dynamicProgramming.wayToSchool;

public class WayToSchool {
    private WayToSchool(){}
    private static class InnerInstance{private static final Solution solution = new Solution();}
    public static int execute(int m, int n, int[][] puddles){return InnerInstance.solution.solution(m, n, puddles);}
}
