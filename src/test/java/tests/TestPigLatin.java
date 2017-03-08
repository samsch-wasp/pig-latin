package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import WordPlay.*;

public class TestPigLatin {

    @Test
    public void consoantRule() {
        PigLatin piglatin = new PigLatin();
        assertEquals("ananabay", piglatin.pigLatin("banana"));
    }

    @Test
    public void vovelRule() {
        PigLatin piglatin = new PigLatin();
        assertEquals("eatway", piglatin.pigLatin("eat"));
    }


    // Example of failing test
    // @Test
    // public void failingTest() {
    //	 assertEquals(0,1);
    // }

}