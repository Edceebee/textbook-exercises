package chapter8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RationalNumbersTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatConstructorIsNotEmpty() {
        RationalNumbers rationalNumbers = new RationalNumbers(2, 4);
        assertNotNull(rationalNumbers);
    }

    @Test
    void testThatConstructorCanBeEmpty() {
        RationalNumbers rationalNumbers = new RationalNumbers();
        assertNotNull(rationalNumbers);
    }

    @Test
    void TestThatNumeratorCanBeSet(){
        RationalNumbers rationalNumbers = new RationalNumbers();
        rationalNumbers.setNumerator(3);
        assertEquals(3, rationalNumbers.getNumerator());
    }

    @Test
    void TestThatDenominatorCanBeSet(){
        RationalNumbers rationalNumbers = new RationalNumbers();
        rationalNumbers.setDenominator(7);
        assertEquals(7, rationalNumbers.getDenominator());
    }
    @Test
    void testThatNumeratorAndDenominatorCanBeDivided(){
        RationalNumbers rationalNumbers = new RationalNumbers();
        rationalNumbers.convertToRationalNumber(3, 8);
        assertEquals("3/8", rationalNumbers.convertToRationalNumber(3,8));
    }

//    @Test
//    void testThatRationalNumbersCanBeAdded(){
//        RationalNumbers rationalNumbers = new RationalNumbers();
//        rationalNumbers.findLCMOfDenominator(6,18);
//        assertEquals(18, rationalNumbers.findLCMOfDenominator(6,18));
   // }
    @Test
    void testThatLCMCanBeCalculated(){
        RationalNumbers rational = new RationalNumbers();
        rational.setDenominator(6);
        rational.setDenominator(8);
        rational.findLCMOfDenominator(2,7,6,9);
        assertEquals(0, rational.findLCMOfDenominator(2,7,6,9));
    }

}