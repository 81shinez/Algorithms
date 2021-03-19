package com.algo.kit.graph.rank;

class Solution {
    public int solution(int n, int[][] results) {
        boolean[][] fw = new boolean[n][n];

        for(int[] intArr : results){
            fw[intArr[0]-1][intArr[1]-1] = true;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    if(fw[j][i]&& fw[i][k]) fw [j][k] = true;
                }
            }
        }

        for(int i = 0; i < fw.length; i++){
            int cnt = 0;
            System.out.print(i+":\t");
            for(boolean num : fw[i]){
                if(num) cnt++;
                System.out.print(num+"\t");
            }
            System.out.println();
        }

        int answer = 0;

        for(int i = 0; i < n; i++){
            boolean bl = false;
            for(int j = 0; j < n; j++){
                if(i==j) continue;
                if(!fw[i][j] && !fw[j][i]){
                    bl = true;
                    break;
                }
            }
            if(!bl)answer++;
        }

        return answer;
    }
}