package com.example.visagca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchRotatedArrayTest {
    @Test
    void testSearch() {
        SearchRotatedArray obj = new SearchRotatedArray();
        assertEquals(4, obj.search(new int[]{4,5,6,7,0,1,2}, 0));
        assertEquals(-1, obj.search(new int[]{4,5,6,7,0,1,2}, 3));
        assertEquals(0, obj.search(new int[]{1}, 1));
    }
}
