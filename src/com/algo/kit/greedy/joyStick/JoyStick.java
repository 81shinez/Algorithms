package com.algo.kit.greedy.joyStick;

public class JoyStick {
    private JoyStick(){};
    private static class InnerInstance{private static final Solution solution = new Solution();}
    public static int execute(String name){return InnerInstance.solution.solution(name);}
}
