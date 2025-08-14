package com.example.visagca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PatternStringMatchTest {
    @Test
    void testCountMatches() {
        PatternStringMatch p = new PatternStringMatch();
        // "abaebio", pattern "010" -> vowel, consonant, vowel
        assertEquals(3, p.countMatches("abaebio", "010"));
        assertEquals(0, p.countMatches("bcdfg", "0")); // no vowels
        assertEquals(5, p.countMatches("aeiou", "0")); // all vowels single-char
    }
}
