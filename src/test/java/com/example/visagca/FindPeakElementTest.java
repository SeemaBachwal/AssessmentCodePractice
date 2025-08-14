package com.example.visagca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindPeakElementTest {
    @Test
    void testFindPeak() {
        FindPeakElement finder = new FindPeakElement();
        int idx1 = finder.findPeakElement(new int[]{1,2,3,1});
        assertEquals(2, idx1);
        int idx2 = finder.findPeakElement(new int[]{1,2,1,3,5,6,4});
        assertTrue(idx2 == 1 || idx2 == 5);
    }
}
