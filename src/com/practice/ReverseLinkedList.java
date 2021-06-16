package com.practice;

import java.util.Stack;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode idxNode = head;

        Stack<ListNode> nodeStack = new Stack<>();

        while (idxNode.next != null) {
            nodeStack.push(idxNode);
            idxNode = idxNode.next;
        }

        ListNode rtnHeadNode = idxNode;

        while (!nodeStack.isEmpty()) {
            idxNode.next = nodeStack.pop();
            idxNode = idxNode.next;
        }

        return rtnHeadNode;
    }
}
