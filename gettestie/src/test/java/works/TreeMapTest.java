package works;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import works.Person;

import java.util.TreeMap;

public class TreeMapTest {

    TreeMap<Integer, Person> tmap = new TreeMap<>();

    private Person tp1, tp2, tp3, tp4, tp5, tp6;

    @Before
    public void setUp() throws Exception {
        tp1 = new Person("John", 1992);
        tp2 = new Person("Sarah", 1954);
        tp3 = new Person("Jose", 1959);
        tp4 = new Person("Sandy", 1964);
        tp5 = new Person("Elizabeth", 1974);
        tp6 = new Person("David", 1982);
        tmap.put(1, tp1);;
        tmap.put(3, tp3);
        tmap.put(4, tp4);
        tmap.put(5, tp5);
        tmap.put(6, tp6);
    }

    @Test
    public void addElementTest () {
        Person expected = null;
        Person actual = tmap.put(2, tp2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeElementTest () {
        Person expected = tp5;
        Person actual = tmap.remove(5);
        Assert. assertEquals(expected, actual);
    }

    @Test
    public void sizeTest () {
        int expected = 5;
        int actual = tmap.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest () {
        Assert.assertFalse(tmap.containsKey(2));
    }
    @Test
    public void isEmptyTest () {
        Assert.assertFalse(tmap.isEmpty());
    }
}

