import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void addNum(){
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(5,5));
    }

    @Test
    public void subNum(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.sub(5,5));
    }
}
