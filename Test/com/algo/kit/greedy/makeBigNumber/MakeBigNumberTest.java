package com.algo.kit.greedy.makeBigNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeBigNumberTest {

    @Test
    void execute() {
        assertEquals(MakeBigNumber.execute("1924", 2), "94");
        assertEquals(MakeBigNumber.execute("1231234", 3), "3234");
        assertEquals(MakeBigNumber.execute("4177252841", 4), "775841");
        assertEquals(MakeBigNumber.execute("1010", 2), "11");
    }
}