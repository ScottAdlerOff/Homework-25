package Service;

import com.example.Homework25.CalculatorService;
import com.example.Homework25.CalculatorServiceIntf;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorParamTest {

    private CalculatorServiceIntf calculatorServiceIntf = new CalculatorService();

    @MethodSource("provideArgumentsPlusTest")
    @ParameterizedTest
    public void testParamPlus(int a, int b, int expected){
        int result = calculatorServiceIntf.plus(a,b);
        Assertions.assertEquals(expected,result);
    }

    @MethodSource("provideArgumentsMultiplyTest")
    @ParameterizedTest
    public void testParamMultiply(int a, int b, int expected){
        int result = calculatorServiceIntf.multiply(a,b);
        Assertions.assertEquals(expected,result);
    }

    @MethodSource("provideArgumentsDivideTest")
    @ParameterizedTest
    public void testParamDivide(float a, float b, float expected){
        float result = calculatorServiceIntf.divide(a,b);
        Assertions.assertEquals(expected,result);
    }

    @ParameterizedTest
    @CsvSource({"4,2,2","15,6,9", "41,21,20"})
    public void testParamMinus(int a, int b, int expected){
        int result = calculatorServiceIntf.minus(a,b);
        Assertions.assertEquals(expected,result);
    }

    private static Stream<Arguments> provideArgumentsPlusTest(){
        return  Stream.of(
                Arguments.of(2,3,5),
                Arguments.of(5,4,9),
                Arguments.of(1,3,4),
                Arguments.of(171,31,202)
        );
    }

    private static Stream<Arguments> provideArgumentsMultiplyTest(){
        return  Stream.of(
                Arguments.of(2,3,6),
                Arguments.of(3,10,30),
                Arguments.of(1,3,3),
                Arguments.of(10,6,60)
        );
    }

    private static Stream<Arguments> provideArgumentsDivideTest(){
        return  Stream.of(
                Arguments.of(6,2,3),
                Arguments.of(10,5,2),
                Arguments.of(5,2.5,2),
                Arguments.of(15,7,7.5)
        );
    }
}
