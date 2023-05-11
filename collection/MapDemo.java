package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new Map<Integer, String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public String get(Object key) {
                return null;
            }

            @Override
            public String put(Integer key, String value) {
                return null;
            }

            @Override
            public String remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends Integer, ? extends String> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<Integer> keySet() {
                return null;
            }

            @Override
            public Collection<String> values() {
                return null;
            }

            @Override
            public Set<Entry<Integer, String>> entrySet() {
                return null;
            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }
        };
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(2,"B");
        map1.put(4,"D");
        map1.put(6,"F");
        map1.put(6,"K");
        map1.put(8,"H");
        map1.put(null,"F");
        map1.put(null,null);
        map1.put(10,"J");
        map1.put(100,"ABC");
        map1.put(19,"JLKI");


//        for(Map.Entry<Integer,String> entry : map1.entrySet()){
//            System.out.println(entry.getKey()+"---"+entry.getValue());
//        }

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(1,"A");
        map2.put(3,"C");
        map2.put(5,"E");
        map2.put(7,"G");
        map2.put(9,"I");
        map1.putAll(map2);
//        for(Map.Entry<Integer,String> entry : map2.entrySet()){
//            System.out.println(entry.getKey()+"---"+entry.getValue());
//        }
        for(Map.Entry<Integer,String> entry : map1.entrySet()){
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
        System.out.println("Size: "+map1.size());
        System.out.println("get:"+map1.get(100));
        System.out.println("remove: "+map1.remove(100));
        System.out.println("replace: "+map1.replace(29,"XYZ"));
        System.out.println("keySet: "+map1.keySet());
        System.out.println("valueSet: "+map1.values());
        //System.out.println("compute: "+map1.compute());
        //computeifabsent/present
        //putifabsent
        //getordefault
    }
}
