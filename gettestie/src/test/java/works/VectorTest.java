package works;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Vector;

public class VectorTest {

    Vector v = new Vector();
    private Person tp1, tp2, tp3, tp4, tp5, tp6;

    @Before
    public void setUp() throws Exception {
        tp1 = new Person("John", 1992);
        tp2 = new Person("Sarah", 1954);
        tp3 = new Person("Jose", 1959);
        tp4 = new Person("Sandy", 1964);
        tp5 = new Person("Elizabeth", 1974);
        tp6 = new Person("David", 1982);
        v.add(tp1);;
        v.add(tp3);
        v.add(tp4);
        v.add(tp5);
        v.add(tp6);
    }

    @Test
    public void addElementTest () {
        Assert.assertTrue(v.add(tp2));
    }

    @Test
    public void removeElementTest () {
        boolean expected = true;

        boolean actual = v.remove(tp5);
        Assert. assertEquals(expected, actual);
    }

    @Test
    public void sizeTest () {
        int expected = 5;
        int actual = v.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest () {
        Assert.assertFalse(v.contains(tp2));
    }
    @Test
    public void isEmptyTest () {
        Assert.assertFalse(v.isEmpty());
    }
}
