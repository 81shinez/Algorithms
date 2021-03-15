package com.algo.kit.bfs_dfs.transformWord;

public class TransformWord {
    private TransformWord(){}
    private static class InnerClass{private static final Solution solution = new Solution();}
    public static int execute(String begin, String target, String[] words){return InnerClass.solution.solution(begin, target, words);}
}
