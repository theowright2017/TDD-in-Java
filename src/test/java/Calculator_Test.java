import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Calculator_Test {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(5, 6);
    }

    @Test
    public void add(){
//        Calculator calculator = new Calculator(5, 6);
        assertEquals(11, calculator.add(), 0);
    }

    @Test
    public void subtract() {
        assertEquals(-1, calculator.subtract(), 0);
    }

    @Test
    public void multiply() {
        assertEquals(30, calculator.multiply(), 0);
    }

    @Test
    public void divide() {
        assertEquals(0.83, calculator.divide(), 0.01);
    }


}
