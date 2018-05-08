package stc9;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import unitTest.HelloWorldTest;

import static org.junit.Assert.*;
import  static  org.mockito.Mockito.*;



public class CalculatorTest {
    private  static Logger logger = Logger.getLogger(HelloWorldTest.class);

    Calculator calculator;

    @BeforeClass
    public  static  void beforeCalculator(){
        logger.info("@beforeClass");
    }

    @Before
    public  void before(){
        Container container = mock(Container.class);
        calculator = new Calculator(container);
    }

    @Test
    public  void summaTest(){
        Container container = mock(Container.class);
        when(container.getSum()).thenReturn(7);
        int sum = this.calculator.summa(3,4);
        assertEquals(sum,7);



    }

    @Test
    public  void multiTest(){

    }





}
