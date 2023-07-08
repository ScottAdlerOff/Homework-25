package Service;

import com.example.Homework25.CalculatorService;
import com.example.Homework25.CalculatorServiceIntf;
import com.example.Homework25.ZeroDividerException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    private CalculatorServiceIntf calculatorServiceIntf = new CalculatorService();


    @Test
    public void testDoNothing() {
    }

    @Test
    public void testPlus(){
        int result = calculatorServiceIntf.plus(2,3);
        Assertions.assertEquals(5,result);
    }

    @Test
    public void testMinus(){
        int result = calculatorServiceIntf.minus(5,2);
        Assertions.assertEquals(3,result);
    }

    @Test
    public void testMultiply(){
        int result = calculatorServiceIntf.multiply(3,2);
        Assertions.assertEquals(6,result);
    }

    @Test
    public void testDivide(){
        float result = calculatorServiceIntf.divide(10,2);
        Assertions.assertEquals(5,result);
    }

    @Test
    public void testDivideException(){
        Assertions.assertThrows(ZeroDividerException.class, () -> calculatorServiceIntf.divide(10,0));
    }
}
