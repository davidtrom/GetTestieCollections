package works;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

    //Iterating LinkedList
//    Iterator<String> iterator=list.iterator();
//      while(iterator.hasNext()){
//        System.out.print(iterator.next()+" ");
//    }

//    Iterator it = list.descendingIterator();
//
//     Displaying list in reverse order
//     System.out.println("Elements in Reverse Order:");
//     while (it.hasNext()) {
//        System.out.println(it.next());
//    }


    private LinkedList<Person> testList = new LinkedList<>();
    private Person tp1, tp2, tp3, tp4, tp5, tp6;

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
    public void addElementsTest () {
        boolean expected = true;
        boolean actual = testList.add(tp2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getFirstElementsTest () {
        testList.add(tp1);;
        testList.add(tp3);
        testList.add(tp4);
        testList.add(tp5);
        testList.add(tp6);

        Person expected = tp1;
        Person actual = testList.getFirst();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getLastElementsTest () {
        testList.add(tp1);;
        testList.add(tp3);
        testList.add(tp4);
        testList.add(tp5);
        testList.add(tp6);

        Person expected = tp6;
        Person actual = testList.getLast();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getElementsTest () {
        testList.add(tp1);;
        testList.add(tp3);
        testList.add(tp4);
        testList.add(tp5);
        testList.add(tp6);

        Person expected = tp5;
        Person actual = testList.get(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void indexOfTest () {
        testList.add(tp1);
        testList.add(tp3);
        testList.add(tp4);
        testList.add(tp5);
        testList.add(tp6);

        int expected = 0;
        int actual = testList.indexOf(tp6);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeOfTest () {
        testList.add(tp1);;
        testList.add(tp3);
        testList.add(tp4);
        testList.add(tp5);
        testList.add(tp6);

        int expected = 5;
        int actual = testList.size();
        Assert.assertEquals(expected, actual);
    }
}
