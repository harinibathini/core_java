package collection.setpractice;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(32);
        set.add(64);
        set.add(2);
        set.add(57);
        set.add(11);
        set.add(13);
        set.add(13);
        set.add(13);
        System.out.println(set);
        set.remove(13);
        System.out.println(set);
        System.out.println(set.contains(100));
        System.out.println(set.contains(11));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set);
    }



}
