package com.algo.leetCode.keysAndRooms;

import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        LinkedList<Integer> openList = new LinkedList<>();
        HashSet<Integer> isOpened = new HashSet<>();

        isOpened.add(0);
        openList.add(0);

        while (!openList.isEmpty()){
            int size = openList.size();
            for(int i = 0; i < size; i++){
                for(int room : rooms.get(openList.pollFirst())){
                    if(!isOpened.contains(room)){
                        openList.add(room);
                        isOpened.add(room);
                    }
                }
            }
        }

        return isOpened.size() == rooms.size();
    }
}