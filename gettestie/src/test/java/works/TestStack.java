package works;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    Stack<Person> stack = new Stack<>();
    private Person tp1, tp2, tp3, tp4, tp5, tp6;


        @Before
        public void setUp() throws Exception {
            tp1 = new Person("John", 1992);
            tp2 = new Person("Sarah", 1954);
            tp3 = new Person("Jose", 1959);
            tp4 = new Person("Sandy", 1964);
            tp5 = new Person("Elizabeth", 1974);
            tp6 = new Person("David", 1982);
            stack.push(tp1);;
            stack.push(tp3);
            stack.push(tp4);
            stack.push(tp5);
            stack.push(tp6);
        }

        @Test
        public void addElementTest () {
            Person expected = tp2;
            Person actual = stack.push(tp2);
            Assert.assertEquals(expected, actual);

        }

        @Test
        public void removeElementTest () {
            Person expected = tp5;
            Person actual = stack.remove(3);
            Assert. assertEquals(expected, actual);
        }

        @Test
        public void sizeTest () {
            int expected = 5;
            int actual = stack.size();
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void containsTest () {
            Person expected = tp6;
            Person actual = stack.peek();
            Assert.assertEquals(expected, actual);
        }

    @Test
    public void searchTest () {
        int expected = 3;
        int actual = stack.search(tp4);
            Assert.assertEquals(expected, actual);
    }




    @org.junit.After
    public void tearDown() throws Exception {
    }

}
