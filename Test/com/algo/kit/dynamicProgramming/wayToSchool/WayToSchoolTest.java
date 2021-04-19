package com.algo.kit.dynamicProgramming.wayToSchool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WayToSchoolTest {

    @Test
    void execute() {
        assertEquals(WayToSchool.execute(4,3,new int[][]{{2, 2}}), 4);
    }
}