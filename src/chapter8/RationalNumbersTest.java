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
        assertEquals(0, rationalNumbers.convertToRationalNumber(3,8));
    }
    @Test
    void testThatRationalNumbersCanBeAdded(){

    }
}