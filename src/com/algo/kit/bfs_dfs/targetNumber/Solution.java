package com.algo.kit.bfs_dfs.targetNumber;

class Solution {
    int answer(int[] numbers, int target, int number, int depth, int ans){
        if(depth == numbers.length - 1){
            if(number + numbers[depth] == target || number - numbers[depth] == target) {
                return ans + 1;
            } else return ans;
        }
        return answer(numbers, target, number + numbers[depth], depth+1, ans) + answer(numbers, target, number - numbers[depth], depth+1, ans);
    }

    public int solution(int[] numbers, int target) {
        return answer(numbers, target, 0, 0, 0);
    }
}