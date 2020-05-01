package main.java.test;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        map.put("s1",0.1);
        map.put("s2",1.1);

        System.out.println(map);
    }
}
