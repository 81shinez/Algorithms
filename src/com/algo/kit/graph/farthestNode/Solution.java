package com.algo.kit.graph.farthestNode;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.LinkedList;
//
//class Solution {
//    private class Node{
//        int val;
//
//        ArrayList<Node> nextNodeList = new ArrayList<>();
//
//        Node(int val){
//            this.val = val;
//        }
//    }
//
//    public int solution(int n, int[][] edge) {
//        int answer = 0;
//        HashSet<Node> isTraveledSet = new HashSet<>();
//        HashMap<Integer, Node> nodeMap = new HashMap<>();
//        LinkedList<Node> nextNodeList = new LinkedList<>();
//
//        for(int idx = 1; idx <= n; idx++){
//            nodeMap.put(idx, new Node(idx));
//        }
//
//        for(int[] intArr : edge){
//            nodeMap.get(intArr[0]).nextNodeList.add(nodeMap.get(intArr[1]));
//            nodeMap.get(intArr[1]).nextNodeList.add(nodeMap.get(intArr[0]));
//        }
//
//        nextNodeList.add(nodeMap.get(1));
//        isTraveledSet.add(nodeMap.get(1));
//
//        while(!nextNodeList.isEmpty()){
//            answer = nextNodeList.size();
//            for(int cnt = 0; cnt < answer; cnt++){
//                for(Node node : nextNodeList.pollFirst().nextNodeList){
//                    if(isTraveledSet.add(node)){
//                        nextNodeList.addLast(node);
//                    }
//                }
//            }
//        }
//        return answer;
//    }
//}

import java.util.*;

class Solution{
    public int solution(int n, int[][] edge) {
        int answer = 0;
        HashSet<Integer> isTraveledSet = new HashSet<>();
        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
        LinkedList<Integer> nextNodeList = new LinkedList<>();

        for(int[] intArr : edge){
            if(!graph.containsKey(intArr[0])){
                graph.put(intArr[0], new ArrayList<>());
            }
            if(!graph.containsKey(intArr[1])){
                graph.put(intArr[1], new ArrayList<>());
            }
            graph.get(intArr[0]).add(intArr[1]);
            graph.get(intArr[1]).add(intArr[0]);
        }

        nextNodeList.add(1);
        isTraveledSet.add(1);

        while(!nextNodeList.isEmpty()){
            answer = nextNodeList.size();
            for(int cnt = 0; cnt < answer; cnt++){
                for(int node : graph.get(nextNodeList.pollFirst())){
                    if(isTraveledSet.add(node)){
                        nextNodeList.addLast(node);
                    }
                }
            }
        }

        return answer;
    }
}