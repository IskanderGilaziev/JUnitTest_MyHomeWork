package unitTest;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import  static  org.mockito.Mockito.*;

public class HelloWorldTest {
    private  static Logger logger = Logger.getLogger(HelloWorldTest.class);

   private HelloWorld helloWorld;

   @BeforeClass
    public  static void beforeTest(){
       logger.info("@BeforeClass");
   }

   @Before
    public  void before(){
        logger.info("@Before");
        this.helloWorld = new HelloWorld();// создаем экземпляр helloworld
       // junit не гарантирует порядок исполнения

   }

   @Test
    public  void sumTest(){
        logger.info("SumTest");
        int sum = this.helloWorld.sum(2,3);

        assertTrue("Sum is incorrect",sum==5);
   }


   @Test
    public void doSomeTestPosition(){
        logger.info("doSomeTest");
       String res=null;
       try {
            res = this.helloWorld.doSome(4);
       } catch (Exception e) {
           e.printStackTrace();
       }
       assertEquals("",res);
   }

    @Test(expected = RuntimeException.class)
    public void doSomeTestWithException() throws Exception {
        logger.info("doSomeTest2");
        String res=null;

        this.helloWorld.doSome(5);


    }

@Test
    public  void    foreignMethod(){
      //  SomeToMock someToMock = new SomeToMock(2,3);
    //create mock
        SomeToMock someToMock = mock(SomeToMock.class);
        when(someToMock.multiply()).thenReturn(42);//здесь должны возращать то что должно возращать методом
        int res=this.helloWorld.foreignMethod(1,someToMock);
        assertEquals(res,7);//нужно мокнуть, а не создавать объекты новых классов

}






}
