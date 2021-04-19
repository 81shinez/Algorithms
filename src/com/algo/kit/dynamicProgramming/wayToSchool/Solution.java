package com.algo.kit.dynamicProgramming.wayToSchool;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        boolean[][] isPud = new boolean[m][n];
        long[][] map = new long[m][n];


        // Initialize
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++){
                map[i][j] = 0;
            }
        }
        for(boolean[] boolArr : isPud){
            for(boolean bool : boolArr){
                bool = false;
            }
        }
        for(int[] intArr : puddles){
            isPud[intArr[0] - 1][intArr[1] - 1] = true;
        }

        map[0][0] = 1;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(isPud[i][j]) continue;
                if(j > 0 && i > 0) {
                    if (isPud[i - 1][j] && isPud[i][j - 1]) {
                        isPud[i][j] = true;
                        continue;
                    }
                }
                if(j > 0){
                    if(!isPud[i][j-1]){
                        map[i][j] = (map[i][j] + map[i][j-1]) % 1000000007;
                    }
                }
                if(i > 0){
                    if(!isPud[i-1][j]){
                        map[i][j] = (map[i][j] + map[i-1][j]) % 1000000007;
                    }
                }
            }
        }

        return (int)(map[m-1][n-1]);
    }
}