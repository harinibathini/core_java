package collection.listpractice;

import java.util.ArrayList;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(7);
        list1.add(8);
        list.addAll(list1);
        System.out.println(list);
        list.remove(1);
        list.remove(2);
        list.add(3,5);
        list.remove(Integer.valueOf(7));
        System.out.println(list);
        System.out.println(list.get(1));
    }
        }
