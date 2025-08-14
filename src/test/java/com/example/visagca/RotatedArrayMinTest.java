package com.example.visagca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RotatedArrayMinTest {
    @Test
    void testFindMinBasic() {
        RotatedArrayMin obj = new RotatedArrayMin();
        assertEquals(0, obj.findMin(new int[]{4,5,6,7,0,1,2}));
        assertEquals(1, obj.findMin(new int[]{3,4,5,1,2}));
    }

    @Test
    void testAlreadySorted() {
        RotatedArrayMin obj = new RotatedArrayMin();
        assertEquals(1, obj.findMin(new int[]{1,2,3,4,5}));
    }
}
