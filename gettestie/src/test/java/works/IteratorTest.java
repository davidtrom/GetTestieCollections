package works;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

    ArrayList<String> tset = new ArrayList<String>();
    String tp1, tp2, tp3, tp4, tp5, tp6;
    Iterator<String> it;


    @Before
    public void setUp() throws Exception {
        tp1 = "John Smith";
        tp2 = "Sarah Rutherford";
        tp3 = "Jose Zarco";
        tp4 = "Sandy Johnson";
        tp5 = "Elizabeth Warren";
        tp6 = "David Trombello";

        tset.add(tp1);
        tset.add(tp3);
        tset.add(tp4);
        tset.add(tp5);
        tset.add(tp6);
        it = tset.iterator();
    }


    @Test
    public void hasNext() {
        Assert.assertTrue(it.hasNext());
    }

    @Test
    public void nextObject() {
//
//           while (it.hasNext()) {
//            String name = it.next();}
//            Assert.assertEquals(expected, actual);
//        }
//    }
        String expected = tp1;
        String actual = it.next();
        Assert.assertEquals(expected, actual);
    }
}


