package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithTest {
    String input = "wurschtsalatbeschteck";

    @Test
    @DisplayName("It Should return the right string with Contains")
    void testIfItWorksWithContains() {
        assertEquals("wurschtalbekdfgijmnopqvxyz", With.Contains(input));
    }

    @Test
    @DisplayName("It Should return the right string with Loop")
    void testIfItWorksWithLoop() {
        assertEquals("wurschtalbekdfgijmnopqvxyz", With.Loop(input));
    }
}