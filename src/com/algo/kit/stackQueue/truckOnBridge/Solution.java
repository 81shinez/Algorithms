package com.algo.kit.stackQueue.truckOnBridge;

import java.util.LinkedList;

class Solution {
    private class Pair<L,R> {
        L left;
        R right;
        public Pair(L left, R right){
            this.left = left;
            this.right = right;
        }

        public L getLeft() {
            return left;
        }

        public R getRight() {
            return right;
        }

        public void setLeft(L left) {
            this.left = left;
        }

        public void setRight(R right) {
            this.right = right;
        }
    }

    private int sumWeight(LinkedList<Pair<Integer,Integer>> arrayList){
        int tmp = 0;
        for(Pair<Integer, Integer> pair : arrayList){
            tmp += pair.getLeft();
        }
        return tmp;
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        LinkedList<Integer> remainTrucks = new LinkedList<>();
        LinkedList<Pair<Integer,Integer>> onBridge = new LinkedList<>();

        for(int truckWeight : truck_weights){
            remainTrucks.addLast(truckWeight);
        }

        while (!remainTrucks.isEmpty() || !onBridge.isEmpty()) {
            if(!onBridge.isEmpty()){
                if(onBridge.peekFirst().right == answer){
                    onBridge.pollFirst();
                }
            }
            if(!remainTrucks.isEmpty()){
                if(sumWeight(onBridge) + remainTrucks.getFirst() <= weight){
                    onBridge.add(new Pair<Integer,Integer>(remainTrucks.pollFirst(), answer + bridge_length));
                }
            }
            answer++;
        }

        return answer;
    }
}