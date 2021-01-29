package Chapter7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Elimination2Test {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatApplicationCanTestFiveInputs() {

        // given that
        Elimination newElimination = new Elimination();

        // when
        newElimination.acceptInput();

        assertEquals(5, newElimination.getInput()[0]);
        assertEquals(30, newElimination.getInput()[1]);
        assertEquals(40, newElimination.getInput()[2]);
        assertEquals(50, newElimination.getInput()[3]);
        assertEquals(70, newElimination.getInput()[4]);

    }

    @Test
    void testThatValueIsBetweenTenToHundred(){

        //given that
        Elimination newElimination = new Elimination();

        //when
        boolean result = newElimination.shouldTakeInput(5);
        boolean result2 = newElimination.shouldTakeInput(101);
        boolean result3 = newElimination.shouldTakeInput(20);

        assertTrue(result3);
        assertFalse(result);
        assertFalse(result2);

    }
    @Test
    void testThatArrayShouldTakeOnlyUniqueNumbers(){

        // given that
        Elimination newElimination = new Elimination();

        // when
        boolean result = newElimination.takeUniqueInput(12);
        boolean result2 = newElimination.takeUniqueInput(13);
        boolean result3 = newElimination.takeUniqueInput(12);
        boolean result4 = newElimination.takeUniqueInput(15);
        boolean result5 = newElimination.takeUniqueInput(16);

        assertTrue(result);
        assertTrue(result2);
        assertTrue(result3);
        assertTrue(result4);
        assertTrue(result5);

    }
    @Test
    void testThatArrayWillPrintUniqueValues(){

        // given that
        Elimination newElimination = new Elimination();
        newElimination.acceptInput();
        int[] expectedArray = {23, 24, 25, 26, 30};

        // when
        //newElimination.printUniqueValues();
        int[] inputs = newElimination.getPrintUniqueValues();

        // assertArrayEquals(expectedArray, inputs);

        assertEquals(23, newElimination.getPrintUniqueValues()[0]);
        assertEquals(24, newElimination.getPrintUniqueValues()[1]);
        assertEquals(25, newElimination.getPrintUniqueValues()[2]);
        assertEquals(26, newElimination.getPrintUniqueValues()[3]);
        assertEquals(30, newElimination.getPrintUniqueValues()[4]);
    }
}
