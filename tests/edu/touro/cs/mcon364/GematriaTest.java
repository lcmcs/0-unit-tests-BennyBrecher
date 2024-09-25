package edu.touro.cs.mcon364;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GematriaTest {

    @Test
    void gematria() {
        String test = "test";
        int actual = Gematria.gematria(test);
        assertEquals(505,actual);
    }
}