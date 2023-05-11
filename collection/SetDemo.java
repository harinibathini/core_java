package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//1)Order - UNORDERED , 2)Null values - Allowed, 3)Duplicates - Not Allowed
//Generics? - helps to generalize things
public class SetDemo {
    public static void main(String[] args) {
//        Set<Integer> set = new Set<Integer>() {
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<Integer> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            @Override
//            public boolean add(Integer integer) {
//                return false;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends Integer> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//        };
        Set<Integer> set1 = new HashSet<>(); //Upcasting
        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);
        set1.add(9);

        Set<Integer> set2 = new HashSet<>(); //Upcasting
        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(8);
        set2.add(10);

        set1.add(13);
        set1.add(65);
        set1.add(null);
        set1.add(3);
        set1.add(12);
        set1.add(3);
        set1.add(null);

        set1.addAll(set2); //union


        //loop through
        //way1:
        for(Integer i :set1){
            System.out.println(i);
        }
        System.out.println("retail all method(gives intersection): "+set1.retainAll(set2));

//        //        //way2: Iterator
//        Iterator<Integer> iterator = set1.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        System.out.println("contains: "+set1.contains(11));
        System.out.println("contains: "+set1.contains(10));
        System.out.println("Contains Collection:"+set1.containsAll(set2));
        System.out.println("retainAll Method: "+set2.retainAll(set1));
        System.out.println("retail all method(gives intersection): "+set1.retainAll(set2));
        System.out.println("size of set1: "+set1.size());
        System.out.println("size of set2: "+set2.size());
       // System.out.println(set1.spliterator());
    }
}
