package LogParserBook;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import static org.junit.Assert.*;
import  static  org.mockito.Mockito.*;
import java.io.*;


public class MyThreadsTest {

    private  static Logger logger = Logger.getLogger(ParsRunTest.class);

    MyThreads myThreads;
    @Before
    public  void init(){

    }

    @Test
    public  void suarchTest() throws IOException {
        String path=" ";
        String word = "страдание";
        String lines = "Возможно было страданаие";

        myThreads = mock(MyThreads.class);
        BufferedReader bf = mock(BufferedReader.class);

        when(bf.readLine()).thenReturn(lines).thenReturn(null);


        String res = myThreads.search(path,word);
        assertEquals(res,"страдание");
        //вроде мокается буферридер, но понять не могу в чем проблема

        //assertEquals("страдание",bf.readLine());
       // String result = ParsRun.read(myThreads,word);
        //assertEquals(result,word);

    }


}
