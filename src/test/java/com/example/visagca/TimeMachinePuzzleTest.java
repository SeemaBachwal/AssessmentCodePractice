package com.example.visagca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeMachinePuzzleTest {
    @Test
    void testCalculateNetMinutes() {
        TimeMachinePuzzle obj = new TimeMachinePuzzle();
        assertEquals(-8, obj.calculateNetMinutes(10, 2));
        assertEquals(0, obj.calculateNetMinutes(2, 10)); // childhood cutoff beyond age
    }
}
