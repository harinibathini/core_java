package collection.mappractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<String,Integer> numbers = new TreeMap<>();
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        if(!numbers.containsKey("Two")) {
            numbers.put("Two", 23);
        }
        numbers.putIfAbsent("Four", 4);
        numbers.put("Five", 5);

        System.out.println(numbers);
        numbers.remove("Three");
        numbers.remove("Two",2);
        System.out.println(numbers.containsKey("One"));
        System.out.println(numbers.containsValue(1));

        for(Map.Entry<String,Integer> e : numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for(String key : numbers.keySet()){
            System.out.println(key);
        }
        for(Integer value : numbers.values()){
            System.out.println(value);
        }

    }
}
