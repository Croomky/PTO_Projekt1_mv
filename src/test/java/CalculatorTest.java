import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    public void add() {
        assertEquals(5, Calculator.add(-5, 10));
        assertEquals(-4, Calculator.add(1, -5));
        assertEquals(-15, Calculator.add(-5, -10));
        assertEquals(15, Calculator.add(10,5));
    }

    @org.junit.jupiter.api.Test
    public void minus() {
        assertEquals(-15, Calculator.minus(-5, 10));
        assertEquals(6, Calculator.minus(1, -5));
        assertEquals(5, Calculator.minus(-5, -10));
        assertEquals(5, Calculator.minus(10,5));
    }

    @org.junit.jupiter.api.Test
    public void multiply() {
        assertEquals(-50, Calculator.multiply(-5, 10));
        assertEquals(-5, Calculator.multiply(1, -5));
        assertEquals(50, Calculator.multiply(-5, -10));
        assertEquals(50, Calculator.multiply(10,5));
    }

    @org.junit.jupiter.api.Test
    public void divide() {
        assertEquals(-5, Calculator.divide(-50, 10));
        assertEquals(-2, Calculator.divide(10, -5));
        assertEquals(5, Calculator.divide(-50, -10));
        assertEquals(2, Calculator.divide(10,5));
    }
}