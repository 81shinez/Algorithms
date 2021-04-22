package com.algo.kit.greedy.connectIslands;

import java.util.*;

class Solution {
//    // prim
//    public int solution(int n, int[][] costs) {
//        int answer = 0;
//
//        HashMap<Integer, ArrayList<int[]>> edgeMap = new HashMap<>();
//        HashSet<Integer> nodes = new HashSet<>();
//        ArrayList<int[]> edges = new ArrayList<>();
//
//        for(int[] cost : costs){
//            if(edgeMap.containsKey(cost[0])){
//                edgeMap.get(cost[0]).add(new int[]{cost[1], cost[2]});
//            } else {
//                ArrayList<int[]> insertList = new ArrayList<>();
//                insertList.add(new int[]{cost[1], cost[2]});
//                edgeMap.put(cost[0], insertList);
//            }
//            if(edgeMap.containsKey(cost[1])){
//                edgeMap.get(cost[1]).add(new int[]{cost[0], cost[2]});
//            } else {
//                ArrayList<int[]> insertList = new ArrayList<>();
//                insertList.add(new int[]{cost[0], cost[2]});
//                edgeMap.put(cost[1], insertList);
//            }
//            nodes.add(cost[0]);
//            nodes.add(cost[1]);
//        }
//
//        int node = costs[0][0]; // 시작 노드
//        edges.addAll(edgeMap.get(node));
//        nodes.remove(node);
//
//        while(!nodes.isEmpty()){
//            Collections.sort(edges, (o1, o2) -> o1[1] - o2[1]);
//            for(int idx = 0; idx < edges.size(); idx++){
//                int[] edge = edges.get(idx);
//                if(nodes.contains(edge[0])){
//                    nodes.remove(edge[0]);
//                    edges.remove(idx);
//                    edges.addAll(edgeMap.get(edge[0]));
//                    answer += edge[1];
//                    break;
//                }
//            }
//        }
//
//        return answer;
//    }

    // kruskal
    public int solution(int n, int[][] costs){
        int answer = 0;
        int[] fromIsland = new int[n];

        // 모든 간선을 가중치 오름차순으로 정렬
        Arrays.sort(costs, (o1, o2) -> o1[2] - o2[2]);

        for(int idx = 0; idx < n; idx ++){
            fromIsland[idx] = idx;
        }

        for(int[] cost : costs){
            if(findRoot(cost[0], fromIsland) != findRoot(cost[1], fromIsland)){
                fromIsland[findRoot(cost[0], fromIsland)] = findRoot(cost[1], fromIsland);

                answer += cost[2];
            }
        }

        return answer;
    }

    int findRoot(int nodeNo, int[] fromIsland){
        if(fromIsland[nodeNo] == nodeNo) return nodeNo;
        return findRoot(fromIsland[nodeNo], fromIsland);
    }
}