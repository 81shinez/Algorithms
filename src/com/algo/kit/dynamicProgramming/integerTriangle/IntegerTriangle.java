package com.algo.kit.dynamicProgramming.integerTriangle;

public class IntegerTriangle {
    private IntegerTriangle(){}
    private static class InnerInstance{private static final Solution solution = new Solution();}
    public static int execute(int[][] triangle){return InnerInstance.solution.solution(triangle);}
}
