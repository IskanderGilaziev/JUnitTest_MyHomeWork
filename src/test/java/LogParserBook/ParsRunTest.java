package LogParserBook;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import static org.junit.Assert.*;
import  static  org.mockito.Mockito.*;
import org.powermock.*;


public class ParsRunTest {

    private  static Logger logger = Logger.getLogger(ParsRunTest.class);

    String path = "";
    String word = "страдание";
    ArrayList<File> list;
    ParsRun parsRun;
    MyThreads myThreads;
    File file;
    @Before
    public  void init(){
        list = new ArrayList<>();
        file = new File(path);

        this.parsRun = new ParsRun(list,word);
    }

    @Test
    public void startTest(){
        for (File file : list) {
            list.add(file);
            myThreads = mock(MyThreads.class);
            myThreads.start();
        }
    }

    @Test
    public  void readTest() throws IOException {

        myThreads =  mock(MyThreads.class);
        String word = "страдание";
        String line = "возможно здесь страдание" ;
        // тоже самое что и в классе MyThreadsTest
        //вроде мокается, но понять не могу до конца

        when(myThreads.br.readLine()).thenReturn(line,null);
        String[] temp =line.split(" ");

        for (int i = 0; i < temp.length ; i++) {
            temp[i].toLowerCase().contains(word);
        }
        assertEquals(temp,word);
       // String test =  ParsRun.read(myThreads,word);
        //assertEquals(test,"страдание");
    }
}
