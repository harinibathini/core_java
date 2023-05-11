package collection.setpractice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(13);
        set.add(23);
        set.add(113);
        System.out.println(set);
        set.remove(12);
        set.add(0);
        set.add(1);
        set.add(14);
        set.add(243);
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
