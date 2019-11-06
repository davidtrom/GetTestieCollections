package works;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

Set<Person> myHashSet = new HashSet<>();
    private Person tp1, tp2, tp3, tp4, tp5, tp6;

    @Before
    public void setUp() throws Exception {
        Person tp1 = new Person("John", 1992);
        Person tp2 = new Person("Sarah", 1954);
        Person tp3 = new Person("Jose", 1959);
        Person tp4 = new Person("Sandy", 1964);
        Person tp5 = new Person("Elizabeth", 1974);
        Person tp6 = new Person("David", 1982);
        myHashSet.add(tp1);;
        myHashSet.add(tp3);
        myHashSet.add(tp4);
        myHashSet.add(tp5);
        myHashSet.add(tp6);

    }
        @Test
        public void containsTest (){

    Iterator<Person> iterator=myHashSet.iterator();
      while(iterator.hasNext()){
        System.out.print(iterator.next()+" ");
    }

            Assert.assertFalse(myHashSet.contains(tp2));
        }


    @Test
    public void isEmptyTest (){
        //boolean expected = false;
        Assert.assertFalse(myHashSet.isEmpty());
    }

    @Test
    public void isEmptyTest2 (){
        myHashSet.clear();
        Assert.assertTrue(myHashSet.isEmpty());
    }

    @Test
    public void removeTest (){
        myHashSet.add(tp1);;
        myHashSet.add(tp3);
        myHashSet.add(tp4);
        myHashSet.add(tp5);
        myHashSet.add(tp6);
        Assert.assertTrue(myHashSet.remove(tp4));
        System.out.println(myHashSet);
    }

    @Test
    public void sizeTest (){
        int expected = 5;
        int actual = myHashSet.size();
        Assert.assertEquals(expected, actual);
    }

}
