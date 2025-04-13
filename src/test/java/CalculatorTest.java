package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import main.java.Calculator;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result, "Addition should return the correct sum.");
    }
    @Test
    void testAdditionError() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 3);
        assertEquals(6, result, "Addition should return the correct sum.");
    }
}
