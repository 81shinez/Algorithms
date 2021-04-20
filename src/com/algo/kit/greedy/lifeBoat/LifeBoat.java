package com.algo.kit.greedy.lifeBoat;

public class LifeBoat {
    private LifeBoat(){}
    private static class InnerClass {private static final Solution solution = new Solution();}
    public static int execute(int[] people, int limit){return InnerClass.solution.solution(people, limit);}
}
