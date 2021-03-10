package com.algo.kit.dynamicProgramming.integerTriangle;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[][] triangle) {
        if(triangle.length == 1) return triangle[0][0];

        for(int row = 1; row < triangle.length; row++){
            for(int col = 0; col < triangle[row].length; col++){
                int left = 0;
                int right = 0;
                if(col != 0){
                    left = triangle[row-1][col-1];
                }
                if(col != triangle[row].length-1){
                    right = triangle[row-1][col];
                }
                triangle[row][col] += Math.max(left, right);
            }
        }
        return Collections.max(Arrays.stream(triangle[triangle.length-1]).boxed().collect(Collectors.toList()));
    }
}