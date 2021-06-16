package com.algo.kit.heap.diskController;

import java.util.*;

class Solution {
    private class Pair<L, R> {
        L left;
        R right;
        private Pair(L left, R right){
            this.left = left;
            this.right = right;
        }

        public String toString(){
            return ("["+left.toString() + ", " + right.toString()+"]");
        }
    }

    public int solution(int[][] jobs) {

        LinkedList<Pair<Integer, Integer>> pQueueTime = new LinkedList<>();

        PriorityQueue<Pair<Integer, Integer>> pQueueWork = new PriorityQueue<>(Comparator.comparingInt(o -> o.right));


        for(int[] intArr : jobs){
            pQueueTime.add(new Pair<>(intArr[0], intArr[1]));
        }

        Collections.sort(pQueueTime, new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                return o1.left - o2.left;
            }
        });

        ArrayList<Integer> arrayList = new ArrayList<>();


        int time = 0;
        int sum = 0;
        int cnt = 0;
        int tmp;

        while (cnt != jobs.length){
            System.out.println("time: " + time);
            System.out.println("pQueueTime: " + pQueueTime.toString());
            tmp = time;
            while (true){
                if(pQueueTime.isEmpty()) break;
                if(pQueueTime.peekFirst().left <= time){
                    pQueueWork.add(pQueueTime.pollFirst());
                } else break;
            }

            System.out.println("pQueueWork: " + pQueueWork.toString());
            if (!pQueueWork.isEmpty()) {
                sum += (pQueueWork.peek().right + time - pQueueWork.peek().left);
                System.out.println("pQueueWork.peek().right + time - pQueueWork.peek().left: " + (pQueueWork.peek().right + time - pQueueWork.peek().left));
                System.out.println("sum: " + sum);
                time += pQueueWork.peek().right;
                pQueueWork.poll();
                cnt++;
            }
            if(tmp == time) {
                if(pQueueTime.isEmpty()) break;
                else {time = pQueueTime.peekFirst().left;}
            }
        }

        return sum/jobs.length;
    }
}

//class Solution {
//    public int solution(int[][] jobs) {
//		int answer = 0;
//		int len = jobs.length;
//		int time = 0;
//		int idx = 0;
//		Queue<int[]> q = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
//
//		Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
//
//		while (idx < len || !q.isEmpty()) {
//			while (idx < len && jobs[idx][0] <= time)
//				q.offer(jobs[idx++]);
//
//			if (q.isEmpty())
//				time = jobs[idx][0];
//			else {
//				int[] job = q.poll();
//				answer += time - job[0] + job[1];
//                System.out.println("time - job[0] + job[1]: "+(time - job[0] + job[1]));
//                System.out.println("answer: "+answer);
//				time += job[1];
//			}
//		}
//
//		return answer / len;
//	}
//}