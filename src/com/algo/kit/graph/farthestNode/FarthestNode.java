package com.algo.kit.graph.farthestNode;

public class FarthestNode {
    private FarthestNode(){}

    private static class InnerInstance{
        private static final Solution solution = new Solution();
    }

    public static int execute(int n, int[][] edge){return InnerInstance.solution.solution(n,edge);}
}
