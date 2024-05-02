import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator=new Calculator();

    @Test
    void add() {
        assertEquals(8,calculator.add(5,3));
        //факинг фак


    @Test
    void add() {
        assertEquals(0,calculator.add(-1,1));

    }

    @Test
    void dif() {

        assertEquals(0,calculator.dif(1,1));

        assertEquals(-2,calculator.dif(-1,1));

    }

    @Test
    void div() {

        assertEquals(6,calculator.div(12,2));

        assertEquals(0,calculator.div(0,1));

    }

    @Test
    void times() {

        assertEquals(4,calculator.times(2,2));

        assertEquals(-1,calculator.times(-1,1));

    }

    @Test
    void solver() {


        assertEquals(7,calculator.solver());

    }
}