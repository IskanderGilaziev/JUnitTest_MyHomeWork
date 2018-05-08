package stc9;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import unitTest.HelloWorldTest;
import static org.junit.Assert.*;
import  static  org.mockito.Mockito.*;


public class ContainerTest {

    private  static Logger logger = Logger.getLogger(HelloWorldTest.class);

    Container container;

    @Before
    public void before(){
        logger.info("start container");
        this.container = new Container(3,4);

    }

    @Test
    public void multiplyTest (){
        int sum = this.container.multiply();
        assertEquals(sum,12);
    }

    @Test
    public  void getSumTest(){
        int sum1 = this.container.getSum();
        assertEquals(sum1,7);
    }



}
