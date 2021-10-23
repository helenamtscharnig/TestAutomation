import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int a =1;
        int b=2;
        double result = calculator.add(a,b);
        Assertions.assertEquals(4, result);

    }

    @Test
    void subtract() {
        final Calculator calculator = new Calculator();
        int a=2;
        int b=3;
        final double subtract = calculator.subtract(b, a);
        Assertions.assertEquals(1, subtract);
        //oder elegantere Lösung: Assertions.assertEquals(1, calculator.subtract(b,a);

    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    @Test
    void modulo() {
    }

    @Test
    void sum() {
    }
}