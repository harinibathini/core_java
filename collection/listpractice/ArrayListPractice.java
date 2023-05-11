package collection.listpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> studentsName = new ArrayList<>();

        studentsName.size();
        studentsName.add("Harini"); //creates internal array of size 10
       studentsName.add("Krati");
        System.out.println(studentsName);

       studentsName.add("Bala"); //new element added at the end
        System.out.println(studentsName);

//        List<Integer> list = new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println(list);
//
//        list.add(5);
//        System.out.println(list);
//
//        list.add(3,4);
//        System.out.println(list);
//
//        List<Integer> newList = new ArrayList();
//        newList.add(150);
//        newList.add(160);
//        System.out.println(newList);
//
//        List<Integer> list1 = new ArrayList<>();
//        list1.addAll(newList);
//        list1.addAll(list);
//        System.out.println(list1);
//        System.out.println(list1.get(1));
//        System.out.println(list1.get(0));
//
//        list.addAll(newList);
//        System.out.println(list);
//        System.out.println(list.get(3));
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(100);
        list.add(130);
        list.add(190);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        list.remove(Integer.valueOf(100));
        System.out.println(list);
        //list.clear();
        list.set(2,1000);
        System.out.println(list);
        System.out.println(list.contains(50));
        System.out.println(list.contains(1000));

        for(int i=0;i<list.size();i++){
            System.out.println("for loop: element is: "+list.get(i));
        }
        System.out.println(list.get(2));
        for(Integer element : list){
            System.out.println("foreach : "+element);
        }

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("list iterator: "+iterator.next());
        }
    }
}
