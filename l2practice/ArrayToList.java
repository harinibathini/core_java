package l2practice;

import java.util.*;

public class ArrayToList {
    public static void main(String[] args) {
        String arr[] = {"harini", "has", "a", "interview", "today", ".she", "needs", "to", "be", "confident", "while answering", "during", "interview"};
        System.out.println(Arrays.toString(arr));
        List<String> list = new ArrayList<>();
        for (String s : arr) {
            list.add(s);
        }
        System.out.println(list);
        String s = "India is my country.I love my India";
        String a[] = s.split("[ .]");
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }
        }
        System.out.println(map);

    }




}
