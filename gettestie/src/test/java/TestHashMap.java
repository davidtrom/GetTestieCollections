
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import works.Address;
import works.Person;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

public static Map<Person, Address> testHash ;
    Map<Person, Address> expected = new HashMap<>();

    Map<String, String> testHash2 =  new HashMap<String, String>();
    //testHash = new HashMap<>();

    @Before
    public void setUp() throws Exception {

        //Map<String, String> testHash2 =  new HashMap<String, String>();
        testHash2.put("800m", "Patrick Brightwell");
        testHash2.put("1 mile", "Hickam El Geuroj");
        testHash2.put("5K", "Jesse Goodyear");
        testHash2.put("10K", "Steven Wheeler");
        testHash2.put("Half Marathon", "Mike Sewell");
        testHash2.put("Marathon", "Eliud Kichoge");

    }

    @Test
    public void containsKeyTest (){
        boolean expected = true;
        boolean actual = testHash2.containsKey("10K");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void containsValueTest (){
        boolean expected = true;
        boolean actual = testHash2.containsValue("Mike Sewell");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void putIfAbsentTest () {
        String expected = null;
        String actual = testHash2.putIfAbsent("400m", "Michael Johnson");
        //System.out.println(testHash2);
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void entrySetTest () {
        //boolean expected = true;
        //ystem.out.println(testHash2.entrySet());
        //Assert.assertEquals(expected,actual);
    }

    @Test
    public void replaceTest () {
        boolean expected = true;
        boolean actual = testHash2.replace("Half Marathon", "Mike Sewell", "David Trombello");
        Assert.assertEquals(expected,actual);
    }
}


