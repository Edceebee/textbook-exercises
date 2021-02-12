package chapter8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatConstructorWorksFine(){
        ComplexNumber complexNumber = new ComplexNumber(3, 5,-1);
        assertNotNull(complexNumber);
    }
    @Test
    void testThatWeCanSetAndGetComplex1(){
        // given that
        ComplexNumber complexNumber = new ComplexNumber();
        // when
        complexNumber.setComplex1(5 + 3);
        assertEquals(5 + 3, complexNumber.getComplex1());
    }
    @Test
    void testThatWeCanSetAndGetComplex2(){
        // given that
        ComplexNumber complexNumber = new ComplexNumber();
        //when
        complexNumber.setComplex2(5 + 23);
        assertEquals(5 + 23, complexNumber.getComplex2());
    }
    @Test
    void testThatWeCanSetAndGetConstantValue(){
        // given that
        ComplexNumber complexNumber = new ComplexNumber();
        //when
        complexNumber.setValue(-1);
        assertEquals(-1, complexNumber.getValue());
    }
    @Test
    void testThatComPlexNumberCanBeAdded(){
        // given that
        ComplexNumber complexNumber = new ComplexNumber();
        // when
        complexNumber.addition(complexNumber.getComplex1(), complexNumber.getComplex2(), complexNumber.getValue());
        assertEquals(-36, complexNumber.addition(complexNumber.getComplex1(), complexNumber.getComplex2(), complexNumber.getValue()));
    }

    @Test
    void testThatComPlexNumberCanBeSubtracted(){
        // given that
        ComplexNumber complexNumber = new ComplexNumber();
        // when
        complexNumber.subtraction(complexNumber.getComplex1(), complexNumber.getComplex2(), complexNumber.getValue());
        assertEquals(20, complexNumber.subtraction(complexNumber.getComplex1(), complexNumber.getComplex2(), complexNumber.getValue()));
    }
    @Test
    void testThatPrintWorks(){
        // given that
        ComplexNumber complexNumber = new ComplexNumber();
        // when
        complexNumber.printComplexNumber();
        assertTrue(true, complexNumber.printComplexNumber());
    }
}