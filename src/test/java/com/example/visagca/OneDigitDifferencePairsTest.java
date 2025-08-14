package com.example.visagca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OneDigitDifferencePairsTest {
    @Test
    void testCountPairsBasic() {
        OneDigitDifferencePairs obj = new OneDigitDifferencePairs();
        assertEquals(1, obj.countPairs(new int[]{1, 2, 53, 23, 9})); // (53,23)
    }

    @Test
    void testCountPairsMore() {
        OneDigitDifferencePairs obj = new OneDigitDifferencePairs();
        // Same-length: 12, 13, 22, 32 -> pairs differing by one digit:
        // (12,13), (12,22), (12,32), (13,23?) not in list, (13,12 counted), (22,32)
        assertEquals(5, obj.countPairs(new int[]{12, 13, 22, 32}));
    }

    @Test
    void testNoPairs() {
        OneDigitDifferencePairs obj = new OneDigitDifferencePairs();
        assertEquals(0, obj.countPairs(new int[]{10, 20, 30}));
    }
}
