package com.algo.leetCode.swappingNodesInaLinkedList;

import java.util.ArrayList;

class Solution {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<ListNode> nodeList = new ArrayList<>();
        ListNode next = head;
        while(next != null){
            nodeList.add(next);
            next = next.next;
        }
        int tmp = nodeList.get(k-1).val;
        nodeList.get(k-1).val = nodeList.get(nodeList.size()-k).val;
        nodeList.get(nodeList.size()-k).val = tmp;

        return head;
    }
}