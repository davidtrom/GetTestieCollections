package works;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {
    // Loop over all the elements in the ArrayDeque.
//        for (String element : deque) {
//        System.out.println(element);
//    }
//

    ArrayDeque<Person> deque = new ArrayDeque<>();
    private Person tp1, tp2, tp3, tp4, tp5, tp6;

    @Before
    public void setUp() throws Exception {
        tp1 = new Person("John", 1992);
        tp2 = new Person("Sarah", 1954);
        tp3 = new Person("Jose", 1959);
        tp4 = new Person("Sandy", 1964);
        tp5 = new Person("Elizabeth", 1974);
        tp6 = new Person("David", 1982);
        deque.add(tp1);;
        deque.add(tp3);
        deque.add(tp4);
        deque.add(tp5);
        deque.add(tp6);
    }


@Test
    public void addElementTest () {
        Assert.assertTrue(deque.add(tp2));
}

    @Test
    public void removeElementTest () {
        boolean expected = true;

        boolean actual = deque.remove(tp5);
        Assert. assertEquals(expected, actual);
    }

    @Test
    public void sizeTest () {
        int expected = 5;
        int actual = deque.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest () {
        Assert.assertFalse(deque.contains(tp2));
    }

}
