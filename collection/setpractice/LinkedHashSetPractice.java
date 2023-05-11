package collection.setpractice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPractice{
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(12);
        set.add(13);
        set.add(23);
        set.add(113);
        System.out.println(set);
        set.remove(113);
        set.remove(12);
        set.remove(Integer.valueOf(13));
        System.out.println(set);
        set.contains(113);
        set.isEmpty();
        set.add(25);
        set.add(56);
        System.out.println(set);
        Iterator<Integer> i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
