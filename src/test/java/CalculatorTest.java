import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator=new Calculator();
    @Test
    void add() {
        assertEquals(8,calculator.add(5,3));
    }

    @Test
    void dif() {
        assertEquals(0,calculator.dif(1,1));
    }

    @Test
    void div() {
        assertEquals(6,calculator.div(12,2));
    }

    @Test
    void times() {
        assertEquals(4,calculator.times(2,2));
    }

    @Test
    void solver() {
        assertEquals(6,calculator.solver());
    }
}