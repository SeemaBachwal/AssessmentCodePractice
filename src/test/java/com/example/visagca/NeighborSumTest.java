package com.example.visagca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class NeighborSumTest {
    @Test
    void testTransform() {
        NeighborSum ns = new NeighborSum();
        assertArrayEquals(new int[]{3,6,9,7}, ns.transform(new int[]{1,2,3,4}));
        assertArrayEquals(new int[]{5}, ns.transform(new int[]{5}));
    }
}
