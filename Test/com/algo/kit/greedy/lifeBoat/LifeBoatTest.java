package com.algo.kit.greedy.lifeBoat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LifeBoatTest {
    @Test
    void execute() {
        assertEquals(LifeBoat.execute(new int[]{70, 50, 80, 50}, 100), 3);
        assertEquals(LifeBoat.execute(new int[]{70, 80 ,50}, 100), 3);
    }

}