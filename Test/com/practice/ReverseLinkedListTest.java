package com.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void reverseList() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode idxNode = listNode1;
        while (idxNode.next != null){
            System.out.println(idxNode.val);
            idxNode = idxNode.next;
        }

        assertEquals(listNode3, reverseLinkedList.reverseList(listNode1));
    }
}