package works;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    ArrayList<Person> testArrayList = new ArrayList<Person>();
    Person tp1, tp2, tp3, tp4, tp5, tp6;


    @Before
    public void setUp() throws Exception {
        Person tp1 = new Person("John", 1992);
        Person tp2 = new Person("Sarah", 1954);
        Person tp3 = new Person("Jose", 1959);
        Person tp4 = new Person("Sandy", 1964);
        Person tp5 = new Person("Elizabeth", 1974);
        Person tp6 = new Person("David", 1982);


    }

    @Test
    public void addTest () {
        boolean expected = true;
        boolean actual = testArrayList.add(tp2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest () {
        boolean expected = true;
        testArrayList.add(tp2);
        testArrayList.add(tp3);
        testArrayList.add(tp1);
        boolean actual = testArrayList.remove(tp4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTestAtIndex () {
        Person expected = tp2;
        testArrayList.add(tp2);
        testArrayList.add(tp3);
        testArrayList.add(tp1);
        Person actual = testArrayList.remove(0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getPersonTest () {
        Person expected = tp6;
        testArrayList.add(tp2);
        testArrayList.add(tp3);
        testArrayList.add(tp1);
        testArrayList.add(tp6);
        Person actual = testArrayList.get(3);
        Assert.assertEquals(expected, actual);
    }

}
