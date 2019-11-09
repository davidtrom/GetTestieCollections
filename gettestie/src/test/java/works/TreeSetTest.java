package works;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest implements Comparable <String>{
    Set<String> tset = new TreeSet<>();

    private String tp1, tp2, tp3, tp4, tp5, tp6;

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

    }
    @Test
    public void addElementTest (){

//        Iterator<Person> iterator=tset.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next()+" ");
//        }

        Assert.assertFalse(tset.contains(tp2));
    }


    @Test
    public void isEmptyTest (){
        //boolean expected = false;
        Assert.assertFalse(tset.isEmpty());
    }

    @Test
    public void isEmptyTest2 (){
        tset.clear();
        Assert.assertTrue(tset.isEmpty());
    }

    @Test
    public void removeTest (){
        tset.add(tp1);;
        tset.add(tp3);
        tset.add(tp4);
        tset.add(tp5);
        tset.add(tp6);
        Assert.assertTrue(tset.remove(tp4));
        //System.out.println(tset);
    }

    @Test
    public void sizeTest (){
        int expected = 5;
        int actual = tset.size();
        Assert.assertEquals(expected, actual);

    }

//    @Override
//    public int compareTo(Person person1, Person person2) {
//        return person1.getName(person2.getName());
//    }

    @Override
    public int compareTo(String s) {
        return 0;
    }
}

