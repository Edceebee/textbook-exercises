package chapter14;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparePortionOfStringsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatUserCanPrintStringInput(){
        ComparePortionOfStrings newString = new ComparePortionOfStrings();
        newString.setInput("Nonso");
        assertEquals("Nonso", newString.getInput());
    }

    @Test
    void testThatUserCanPrintIndex(){
        ComparePortionOfStrings newString = new ComparePortionOfStrings();
        newString.setIndex(5);
        assertEquals(5, newString.getIndex());
    }

    @Test
    void testThatUserCanPrintNoOfCharacter(){
        ComparePortionOfStrings newString = new ComparePortionOfStrings();
        newString.setNoOfChar(5);
        assertEquals(5, newString.getNoOfChar());
    }



}