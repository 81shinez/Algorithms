package com.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HanoiRecursiveTest {
    @Test
    void execute() {
        HanoiRecursive hanoiRecursive = new HanoiRecursive();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        hanoiRecursive.execute(9, sb1);
        hanoiRecursive.execute_nonRecursive(9, sb2);
        System.out.println(sb1.toString());
        System.out.println(sb2.toString());
        assertEquals(sb1.toString(), sb2.toString());
    }
}
