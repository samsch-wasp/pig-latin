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

    @Test
    public void consonantClusterRule() {
        PigLatin piglatin = new PigLatin();
        assertEquals("eerschay", piglatin.pigLatin("cheers"));
    }

    @Test
    public void wordRow(){
        PigLatin piglatin = new PigLatin();
        assertEquals("anksthay oistmay eggway omeletway", piglatin.pigLatin("thanks moist egg omelet"));
    }

    @Test
    public void capitalLetters(){
        PigLatin piglatin = new PigLatin();
        assertEquals("Anksthay oistmay eggway Omeletway", piglatin.pigLatin("Thanks for the Omelet"));
    }
    


    // Example of failing test
    // @Test
    // public void failingTest() {
    //	 assertEquals(0,1);
    // }

}
