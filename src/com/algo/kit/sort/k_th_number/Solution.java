package com.algo.kit.sort.k_th_number;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answerArrList = new ArrayList<>();

        ArrayList<Integer> tmpArr = new ArrayList<>();

        for(int i = 0; i < commands.length; i++){
            for(int idx = commands[i][0] - 1; idx < commands[i][1]; idx++){
                tmpArr.add(array[idx]);
            }
            Collections.sort(tmpArr);
            answerArrList.add(tmpArr.get(commands[i][2] - 1));
            tmpArr.clear();
        }

        int[] answer = answerArrList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}