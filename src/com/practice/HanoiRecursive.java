package com.practice;

import java.util.ArrayList;
import java.util.Stack;

public class HanoiRecursive {
    ArrayList<Stack<Integer>> poleList;

    void execute(int n, StringBuilder sb){
        poleList = new ArrayList<>();
        poleList.add(new Stack<>());
        poleList.add(new Stack<>());
        poleList.add(new Stack<>());
        for(int idx = n; idx > 0; idx--){
            poleList.get(0).push(n);
        }
        hanoi(n, 0, 1, 2, sb);
    }

    void execute_nonRecursive(int n, StringBuilder sb){
        poleList = new ArrayList<>();
        poleList.add(new Stack<>());
        poleList.add(new Stack<>());
        poleList.add(new Stack<>());
        for(int idx = n; idx > 0; idx--){
            poleList.get(0).push(idx);
        }
        int minPointer = 0;
        while(poleList.get(2).size() != n){
            int leftIdx = (0 == minPointer) ? 2 : minPointer-1;
            move(minPointer, leftIdx, sb);
            minPointer = leftIdx;

            int minIdx = 0;
            int minVal = Integer.MAX_VALUE;
            for(int poleIdx = 0; poleIdx < poleList.size(); poleIdx++){
                if(poleIdx != minPointer && !poleList.get(poleIdx).empty()){
                    if(poleList.get(poleIdx).peek() < minVal) {
                        minIdx = poleIdx;
                        minVal = poleList.get(poleIdx).peek();
                    }
                }
            }
            int toIdx = 0;
            for(int idx = 0; idx < poleList.size(); idx++){
                if(idx == minIdx) continue;
                if(idx == minPointer) continue;
                toIdx = idx;
            }
            if(!poleList.get(minIdx).empty()){move(minIdx, toIdx, sb);}
        }
    }

    void hanoi(int size, int from, int via, int to, StringBuilder sb){
        if(size <= 1){
            move(from, to, sb);
            return;
        }
        hanoi(size - 1, from, to, via, sb);
        move(from, to, sb);
        hanoi(size - 1, via, from, to, sb);
    }

    void move(int from, int to, StringBuilder sb){
        sb.append(from + " pops, to " + to + "\n");
        poleList.get(to).push(poleList.get(from).pop());
    }
}
